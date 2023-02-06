<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회 원 가 입</title>
<link rel="stylesheet" href="/resources/css/main.css">
</head>
<body>
 <c:if test = "${sessionScope.memId eq null}">   <!-- 세션이비어있으면:로그인이 안돼있으면 -->
 	<div id="container">
        <div id="headernav">
            <header>
                <div id="logo"><a href="/index.jsp">심플스케줄러</a></div>
                
               	<form action = "/member/login.do" method="post">
	                    <ul>
	                        <div id="login-area1"><li class="input">ID<input type="text"  name="mem-id"></li></div>
	                        <div id="login-area2"><li class="input">PW<input type="password" name="mem-pw"></li></div>
	                    </ul>
                        <div id="login-area3"><input type="image" id="login" src="/resources/login.png" alt="로긴"></div>
                        <div id="login-area4"><a href="/member/register"><img id="signup" src="/resources/signup.png" alt="가입"></a></div>
            	    </form>
            	    
            </header><br>
            <nav>
                <div id="menus">
                <ul >
                    <li ><a href="#">나의 전체 일정 보기</a></li>
                    <li ><a href="#">공식 일정만 보기</a></li>
                    <li ><a href="#">개인 일정만 보기</a></li>
                    <li ><a href="#">날짜검색으로 일정 보기</a></li>
                    <li >¤</li>
                    <li ><a href="#">새 일정 입력하기</a></li>
                    <li ><a href="#">일정 수정하기</a></li>
                    <li ><a href="#">일정 삭제하기</a></li>
                </ul>
                </div>
                <div id="separate">
                    <img src="/resources/line.png" class="line">
                    회원가입 페이지입니다!
                    <img src="/resources/line.png" class="line">
                </div>               
            </nav>
        </div>
        <main>
        
            <p>…</p>
            <div id="register-input">
                <form action="/member/register" method="post">
                    <ul>
                        <li>
                            <input type="text" name="mem-id" placeholder="아이디 입력">
                        </li>
                        <li>
                            <input type="password" name="mem-pw" placeholder="비밀번호 입력">
                        </li>
                        <li>
                            <input type="text" name="mem-name" placeholder="사용할 이름 입력">
                        </li>
                    </ul>
                    <div>
                        <button>가입하기</button>
                    </div>
                </form>
            </div>

       
        </main>
 </c:if>
 <c:if test = "${sessionScope.memId ne null}"> <!-- 로그인이 되어있으면! -->
	 	<div id="container">
        <div id="headernav">
            <header>
                <div id="logo"><a href="/index.jsp">심플스케줄러</a></div>
                
               	<form action = "/member/login.do" method="post">
	                    <ul>
	                        <div id="login-area1"><li class="input">ID<input type="text"  name="mem-id"></li></div>
	                        <div id="login-area2"><li class="input">PW<input type="password" name="mem-pw"></li></div>
	                    </ul>
                        <div id="login-area3"><input type="image" id="login" src="/resources/login.png" alt="로긴"></div>
                        <div id="login-area4"><a href="/member/register"><img id="signup" src="/resources/signup.png" alt="가입"></a></div>
            	    </form>
            	    
            </header><br>
            <nav>
                <div id="menus">
                <ul >
                    <li ><a href="#">나의 전체 일정 보기</a></li>
                    <li ><a href="#">공식 일정만 보기</a></li>
                    <li ><a href="#">개인 일정만 보기</a></li>
                    <li ><a href="#">날짜검색으로 일정 보기</a></li>
                    <li >¤</li>
                    <li ><a href="#">새 일정 입력하기</a></li>
                    <li ><a href="#">일정 수정하기</a></li>
                    <li ><a href="#">일정 삭제하기</a></li>
                </ul>
                </div>
                <div id="separate">
                    <img src="/resources/line.png" class="line">
                    회원가입 페이지입니다!
                    <img src="/resources/line.png" class="line">
                </div>               
            </nav>
        </div>
	<main>
            <p>…</p>
            <div id="register-input">
                <form action="/member/register" method="post">
                    <ul>
                        <li>
                            ¡¡이미 로그인되어있어요!!
                        </li>
                        
                    </ul>
                    <div>
                        <button type="button" onClick="location.href='../member/index'">메인으로 가기</button>
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