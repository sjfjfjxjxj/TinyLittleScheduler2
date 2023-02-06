<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>심플스케줄러</title>
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
 <c:if test = "${sessionScope.memId ne null}"> <!-- 로그인이 되어있으면! -->
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
	                    <li ><a href="/schedule/list/all?mem-id=${sessionScope.memId}" name=${sessionScope.memId}>나의 전체 일정 보기</a></li>
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
	                총 [n] 건의 전체 일정이 있어요.
	                <img src="/resources/line.png" class="line">
	            </div>
	        </nav>
	    </div>
	    <main>
<%-- 	    <c:forEach items ="{schList}" var="schedule"> --%>
<!-- 	     <ul> -->
<!--                 <li class="when-howmanycases"> -->
<!--                     [yyyy]년 [mm]월 [dd]일 - [n]건 -->
<!--                     <li class="officheck-3wh"> -->
<!--                     	[공식일정] | [where]에서 [who]랑 [what]을 할 예정이에요 -->
<%-- <%--                         ${schedule.scheOfficialCheck} | ${schedule.scheToWhere}에서 [schedule.scheWithWhom]랑 [schedule.scheTodo]을 할 예정이에요 --%> --%>
<!--                     </li>     -->
<!--                     <li class="officheck-3wh"> -->
<!--                         [공식일정] | [where]에서 [who]랑 [what]을 할 예정이에요 -->
<!--                     </li> -->
<!--                 </li> -->
          
<!--             </ul> -->
<%--             </c:forEach> --%>
	    
         
	    </main>
     
     
     
     
 	</c:if>     
        <footer>
            <div>ⓒTinyTinyProjectByMinaHeo</div>
        </footer>
    </div>


</body>
</html>