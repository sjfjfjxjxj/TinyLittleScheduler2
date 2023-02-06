<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>나 의 정 보</title>
<link rel="stylesheet" href="/resources/css/main.css">
</head>
<body>
<c:if test = "${sessionScope.memId ne null}">
<div id="container">
        <div id="headernav">
            <header>
                <div id="logo"><a href="/index.jsp">심플스케줄러</a></div>
                
               	<form action = "/member/logout.do" method="post"> 
	                 <div id="login-area5"><a href="/member/myInfo?mem-id=${sessionScope.memId}">${sessionScope.memId}님</a> 안녕하세요!</div>
	                    <div id="login-area6"><a href=/member/logout.do><img src="/resources/logout.png" alt="로그아웃" id="logout" ></a></div>
	                   
 	        	</form> 
            	    
            </header><br>
            <nav>
                <div id="menus">
                <ul >
                    <li ><a href="/schedule/list/all?mem-id=${sessionScope.memId}">나의 전체 일정 보기</a></li>
                    <li ><a href="#">공식 일정만 보기</a></li>
                    <li ><a href="#">개인 일정만 보기</a></li>
                    <li ><a href="#">날짜검색으로 일정 보기</a></li>
                    <li >¤</li>
                    <li ><a href="/schedule/write?mem-id=${sessionScope.memId}">새 일정 입력하기</a></li>
                    <li ><a href="#">일정 수정하기</a></li>
                    <li ><a href="#">일정 삭제하기</a></li>
                </ul>
                </div>
                <div id="separate">
                    <img src="/resources/line.png" class="line">
                    나의 정보 확인 및 수정하기
                    <img src="/resources/line.png" class="line">
                </div>               
            </nav>
        </div>
        <main>
            <p>…</p>
            <div id="register-input">
                <form action="/member/update" method="post">
                    <ul>
                        <li>
                            <input type="text" name="mem-id" value="${member.memId}" readonly>
                        </li>
                        <li>
                            <input type="password" name="mem-pw" placeholder="비밀번호 입력" value="${member.memPw}">
                        </li>
                        <li>
                            <input type="text" name="mem-name" placeholder="사용할 이름 입력" value = "${member.memName}">
                        </li>
                        <li>
                            <input type="text" name="mem-enroll-date" value = "${member.memEnrollDate}" readonly>
                        </li>
                    </ul>
                    <div>
                        <button>수정하기</button>
                    </div>
                    <div>
                        <button><a href="/member/withdraw?mem-id=${sessionScope.memId}">탈퇴하기</button>
                    </div>
                </form>
            </div>
      
     </main>
</c:if>           
            
        <footer>
            <div>ⓒTinyTinyProjectByMinaHeo</div>
        </footer>
    </div>



</body>
</html>