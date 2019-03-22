package com.StudyCastle.FinallyProject;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import dto.AcaClassDTO;
import dto.AcaInfoRegiEditDTO;
import dto.CategoryDTO;
import impl.AcademyInfoImpl;
import impl.AcademyInfoRegiEditImpl;
import mybatis01.AcaTeacherDTO;
import mybatis01.ClassInfoDTO;

@Controller
public class AcademyRegistEditContoller {
	
	@Autowired
	private SqlSession sqlSession;
	
	//학원등록 및 수정페이지 바로가기
	@RequestMapping("/catle/acaInfoRegiEdit.do")
	public String acaInfoRegiEdit(Model model, HttpSession session, HttpServletRequest req) throws UnsupportedEncodingException {
		
		//학원정보 불러오기
		String id = (String) session.getAttribute("USER_ID");
		AcaInfoRegiEditDTO acaRegiEditDTO = sqlSession.getMapper(AcademyInfoRegiEditImpl.class).AcaInfoLoad(id);
		model.addAttribute("RegiEditdto", acaRegiEditDTO);
		
		//카테고리 정보 불러오기
		ArrayList<CategoryDTO> categoryDTO = sqlSession.getMapper(AcademyInfoRegiEditImpl.class).categorySelect();
		model.addAttribute("categorytList",categoryDTO);
		
		
		//등록된 강사 정보 불러오기
		ArrayList<AcaTeacherDTO> tealists = sqlSession.getMapper(AcademyInfoRegiEditImpl.class).TeacherList(id);
		model.addAttribute("tealists",tealists);
		System.out.println("tealists: "+ tealists);
		
		
		//등록된 강의 정보 불러오기
		ArrayList<AcaClassDTO> classlists = sqlSession.getMapper(AcademyInfoRegiEditImpl.class).ClassList(id);
		model.addAttribute("classlists",classlists);
		System.out.println("classlists: "+ classlists);
		
		return "01Main/acaInfoRegiEdit";
		
	}
	
	@RequestMapping("/catle/AcaInfoUpdate.do")
	public String AcaInfoUpdate(Model model, HttpSession session, HttpServletRequest req, MultipartHttpServletRequest mtfRequest) throws UnsupportedEncodingException {
		
		String id = (String) session.getAttribute("USER_ID");
		
		//학원정보 업데이트
		req.setCharacterEncoding("UTF-8");
		String telephone1 = req.getParameter("telephone1");
		String address = req.getParameter("address");
		String detailaddress = req.getParameter("detailaddress");
		String acaname = req.getParameter("acaname");
		String telephone2 = req.getParameter("telephone2");
		String telephone3 = req.getParameter("telephone3");
		String introduce = req.getParameter("introduce");
		String category = req.getParameter("category");
		String acaintrophoto = req.getParameter("acaintrophoto");		
		
		sqlSession.getMapper(AcademyInfoRegiEditImpl.class).AcaInfoRegiEdit(address,detailaddress,acaname,telephone1,telephone2,telephone3,id);
		sqlSession.getMapper(AcademyInfoRegiEditImpl.class).AcaInfoRegiEdit2(introduce,category,acaintrophoto,id);
  
		return "redirect:acaInfoRegiEdit.do"; 
	}
	
	//강사정보 입력
	@RequestMapping("/catle/teaInfoInsert.do")
	public String teaInfoInsert(Model model, HttpSession session, HttpServletRequest req) throws UnsupportedEncodingException {
		
		req.setCharacterEncoding("UTF-8");
		String id = (String) session.getAttribute("USER_ID");
		String teaimage = req.getParameter("teaimage");
		String teaname = req.getParameter("teaname");
		String teaintro = req.getParameter("teaintro");
		String subject = req.getParameter("subject");
		
		sqlSession.getMapper(AcademyInfoRegiEditImpl.class).TeacherRegi(teaimage, teaname, teaintro, subject, id);
		
		return "redirect:acaInfoRegiEdit.do";
	}
	
	//강의정보 입력
	@RequestMapping("/catle/classInfoInsert.do")
	public String classInfoInsert(AcaClassDTO acaClassDTO, Model model, HttpSession session, HttpServletRequest req) {
	
		sqlSession.getMapper(AcademyInfoRegiEditImpl.class).ClassRegi(acaClassDTO);
		
		return "redirect:acaInfoRegiEdit.do";
	}

	
	//강사정보 상세보기
	@RequestMapping("/catle/teacherInfoView.do")
	public String classInfoView(AcaTeacherDTO acaTeacherDTO, Model model, HttpServletRequest req, HttpSession session) {
		
		String id = (String) session.getAttribute("USER_ID");
		sqlSession.getMapper(AcademyInfoRegiEditImpl.class).teacherView(acaTeacherDTO,id);
		model.addAttribute("teaDTO", acaTeacherDTO);
		
		return "02sub/teacherInfoView";
	}
		
	//강의정보 상세보기
	@RequestMapping("/catle/classInfoView.do")
	public String classInfoView(Model model, HttpServletRequest req, HttpSession session) {
		
		String id = (String) session.getAttribute("USER_ID");
		String classidx = req.getParameter("classidx");
		AcaClassDTO acaClassDTO = sqlSession.getMapper(AcademyInfoRegiEditImpl.class).classView(classidx);
		model.addAttribute("classDTO", acaClassDTO);
		
		ArrayList<AcaTeacherDTO> tealists = sqlSession.getMapper(AcademyInfoRegiEditImpl.class).TeacherList(id);
		model.addAttribute("tealists",tealists);
		
		return "02sub/classInfoView";
	}
	
	
	
	//강사정보수정
	@RequestMapping("/catle/teaInfoUpdate.do")
	public String teaInfoUpdate(AcaTeacherDTO acaTeacherDTO, Model model, HttpSession session, HttpServletRequest req) {
		
		sqlSession.getMapper(AcademyInfoRegiEditImpl.class).teaInfoUpd(acaTeacherDTO);
		
		return "redirect:acaInfoRegiEdit.do";
	}
	
	//강의정보수정
	@RequestMapping("/catle/classInfoUpdate.do")
	public String classInfoUpdate(AcaClassDTO acaClassDTO, Model model, HttpSession session, HttpServletRequest req) {
	
		sqlSession.getMapper(AcademyInfoRegiEditImpl.class).classInfoUpd(acaClassDTO);
		
		return "redirect:acaInfoRegiEdit.do";
	}
	
	//강사정보삭제
	@RequestMapping("/catle/teaInfoDelete.do")
	public String teaInfoDelete(AcaTeacherDTO acaTeacherDTO, Model model, HttpSession session, HttpServletRequest req) {
		
		sqlSession.getMapper(AcademyInfoRegiEditImpl.class).teaInfoDel(acaTeacherDTO);
		
		return "redirect:acaInfoRegiEdit.do";
	}
	
	//강의정보삭제
	@RequestMapping(value="/catle/classDelete/{classidx}", method = RequestMethod.GET )
	public String classDelete(AcaClassDTO acaClassDTO, Model model, HttpSession session, HttpServletRequest req) {
		
		
		sqlSession.getMapper(AcademyInfoRegiEditImpl.class).classDel(acaClassDTO);
		
		return "";
	}
	
	
	
}
