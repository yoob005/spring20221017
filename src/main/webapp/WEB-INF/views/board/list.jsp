<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="my" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
<body>
	<my:navBar active="list"></my:navBar>
	
	<div class="container-md">
		<div class="row">
			<div class="col">
			

				<c:if test="${not empty message }">
					<div class="alert alert-success">
						${message }
					</div>
				</c:if>
				
				<h1>게시물 목록</h1>
				<table class="table">
					<thead>
						<tr>
							<th>#</th>
							<th>제목</th>
							<th>작성자</th>
							<th>작성일시</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${boardList}" var="board">
							<tr>
								<td>${board.id }</td>
								<td>
									<c:url value="/board/get" var="getLink">
										<c:param name="id" value="${board.id }"></c:param>
									</c:url>
									<a href="${getLink }">
										${board.title }
									</a>
								</td>
								<td>${board.writer }</td>
								<td>${board.inserted }</td>
							</tr>
						</c:forEach> 
					</tbody>
				</table>
			</div>
		</div>
		
		<!-- .row>.col -->
		<div class="row">
			<div class="col">
				<nav aria-label="Page navigation example">
				  <ul class="pagination">
				  	<c:forEach begin="${pageInfo.leftPageNumber }" end="${pageInfo.rightPageNumber }" var="pageNumber">
				  		<c:url value="/board/list" var="listLink">
				  			<c:param name="page" value="${pageNumber }" />
				  		</c:url>
					    <li class="page-item
					    
					    	<%-- 현재페이지에 active 클래스 추가 --%>
					    	${pageInfo.currentPageNumber eq pageNumber ? 'active' : '' }
					    
					    "><a class="page-link" href="${listLink }">${pageNumber }</a></li>
				  	</c:forEach>
				  </ul>
				</nav>
			</div>
		</div>
	</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>
</html>









