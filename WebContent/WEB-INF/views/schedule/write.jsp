<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>새 일 정 등 록</title>
<link rel="stylesheet" href="/resources/css/write.css">
</head>
<body>
<c:if test = "${sessionScope.memId eq null}">
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
	                    <li ><a href="/schedule/write?mem-id=${sessionScope.memId}">새 일정 입력하기</a></li>
	                    <li ><a href="#">일정 수정하기</a></li>
	                    <li ><a href="#">일정 삭제하기</a></li>
                	</ul>
                </div>
                <div id="separate">
                    <img src="/resources/line.png" class="line">
                    로그인을 해주세요!
                    <img src="/resources/line.png" class="line">
                </div>
                
            </nav>
        </div>
        <main>
        <br><br><br><br><br><br><br><br><br><br>
          
        </main>
</c:if>

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
                    새로운 일정이 있나요?
                    <img src="/resources/line.png" class="line">
                </div>               
            </nav>
        </div>
        <main>
            <p>…</p>
            <div id="register-input">
                <form action="/schedule/write" method="post">
                    <ul>
                        <li>
                            <input type="text" name="sche-title" placeholder="일정제목입력">
                        </li>
                        <li>
                            <input type="text" name="sche-deadline" placeholder="그게언제죠?(yyyymmdd입력)"">
                        </li>
                        <li>
                            <input type="text" name="sche-official-check" placeholder="공식/개인여부->라디오버튼으로 ">
                        </li>
                        <li>
                            <input type="text" name="sche-todo" placeholder="무엇을 하나요?">
                        </li>
                        <li>
                            <input type="text" name="sche-with-whom" placeholder="누구랑 할 건가요?">
                        </li>
                        <li>
                            <input type="text" name="sche-to-where" placeholder="어디서 하나요?">
                        </li>
                    </ul>
                    <div>
                        <button>일정추가하기</button>
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