<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 파일며이 Logout.jsp --%>

<%
//request.getSession().removeAttribute("USER_ID");

//영역의 속성 지우기
session.removeAttribute("USER_ID");

//세션영역 비우기(위에서 속성을 지웠으므로 없어도 무방)
//session.invalidate();

/* response.sendRedirect("/catle/Login.do"); */
/* response.sendRedirect("01Main/Login"); */
response.sendRedirect("/catle/main.do");
%>