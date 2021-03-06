<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html lang="en">

<head>
  <style>
  /* 모달창 */
	.modal {
		text-align: center;
		padding: 0!important;
	}
	.modal:before {
		content: '';
		display: inline-block;
		height: 100%;
		vertical-align: middle;
		margin-right: -4px;
	}
	.modal-dialog {
		display: inline-block;
		text-align: left;
		vertical-align: middle; 
	}
  </style> 
  
  <!-- 끌어온 스킨의 것 -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  
  <title>학원기본정보 수정</title>
  
  <!-- Bootstrap core CSS -->
  <link href="../resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
 
  <!-- Custom fonts for this template -->
  <link href="../resources/vendor/fontawesome-free/css/all.min.css" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css?family=Varela+Round" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="../resources/css/grayscale.min.css" rel="stylesheet">

</head>

<body id="page-top">

  <!-- Nav Bar -->
  <%@ include file="/../resources/DR_common/commonNavTop.jsp" %>
  <!-- Nav Bar -->
  <!-- Header -->

  <header class="masthead" style="height:auto; linear-gradient(to bottom, rgba(22, 22, 22, .1) 0,rgba(22, 22, 22, .5) 75%, #161616 100%), url('../img/back2.jpg');">
    <div class="container d-flex h-100 align-items-center">
      <div class="mx-auto text-center" style="width:auto; height:auto;background-color: white;margin-top:150px;;border-radius: 5px;padding-top: 5%;padding-bottom: 5%  ">
        <%@ include file="/../resources/DR_common/commonMemberModifyA.jsp" %>
      </div>
    </div>
  </header>
  
  <!-- Footer -->
  <footer class="bg-black small text-center text-white-50">
    <%@ include file="/../resources/DR_common/commonBottom.jsp" %>
  </footer>

  <!-- Bootstrap core JavaScript -->
  <script src="/FinallyProject/resources/vendor/jquery/jquery.min.js"></script>
  <script src="/FinallyProject/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Plugin JavaScript -->
  <script src="/FinallyProject/resources/vendor/jquery-easing/jquery.easing.min.js"></script>

  <!-- Custom scripts for this template -->
  <script src="/FinallyProject/resources/js/grayscale.min.js"></script>

</body>
</html>
