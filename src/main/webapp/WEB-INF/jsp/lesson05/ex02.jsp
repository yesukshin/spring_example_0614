<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl core 라이브러리(2)</title>
</head>
<body>
	<h1>1. 조건문(c:choose, c:when, c:otherwise)</h1>
	<c:set var="weight" value="65" />
	<c:choose>
		<c:when test="${weight < 60}">
      	떡볶이 먹자<br>
		</c:when>
		<c:when test="${weight < 70}">
      	샐러드 먹자<br>
		</c:when>
		<c:otherwise>
         굷자<br>
		</c:otherwise>
	</c:choose>

	<h1>2. 반복문 (c:forEach)</h1>
	<c:forEach begin="0" end="5" step="1" var="var1">
      ${var1}<br>
	</c:forEach>
	<c:forEach begin="16" end="20" step="1" var="var2" varStatus="status">
      val: ${var2}   	
      current: ${status.current} 
      first: ${status.first} 
      last: ${status.last} 
      count:${status.count}
      index:${status.index}
      <br>
	</c:forEach>

	<%--서버에서 가져온 List<String> 출력 --%>
	<c:forEach items="${fruits}" var="fruit" varStatus="status">
   		${fruit} ::::::::::${status.count}:::::${status.index}    
   </c:forEach>
	<br>

	<%--서버에서 가져온 List<Map> 출력 --%>
	<c:forEach items="${users}" var="user" varStatus="status">
		<h3>${status.count}번째사람 정보</h3>
   		이름:${user.name}
   		나이:${user.age}
   		취미:${user.hobby}   		
   </c:forEach>
	<%-- 테이블로 구성 --%>
	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>나이</th>
				<th>취미</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${users}" var="user" varStatus="status">
				<tr>
					<td>${status.count}</td>
					<td>${user.name}</td>
					<td>${user.age}</td>
					<td>${user.hobby}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>