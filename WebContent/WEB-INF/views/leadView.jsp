<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Items</title>
<link type="text/css" rel="stylesheet" href="./css/lead.css">

</head>
<body>
<nav>
<img src="./css/logo.png" alt="logo"/>
<ul>
<li><a href="${PageContext.request.contextPath}/login">Login</a></li>
<li><a href="${PageContext.request.contextPath}/signup">Sign Up</a></li>
</ul>
</nav>

<div>
		<div>
			<h2 align="center">List of Leads</h2>
			<hr>
			<div>
<a href="new"><button class="button" id="addBlog"><i class="fas fa-plus-circle"></i>Add lead</button></a>
			</div>
			<br>
			
<table>
				<thead>
					<tr>
					    <th>Lead-Id</th>
						<th>Lead-Name</th>
						<th>Lead-Gender</th>
						<th>Lead-Address</th>
						<th>Lead-Phoneno</th>
						<th>Lead-Email</th>
						<th>Lead-Uername</th>
						<th>Lead-Password</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
					
					<c:forEach var="lead" items="${listLead}">

						<tr>
							<td><c:out value="${lead.getId()}" /></td>
							<td><c:out value="${lead.getName()}" /></td>
							<td><c:out value="${lead.getGender()}" /></td>
							<td><c:out value="${lead.getAddress()}" /></td>
							<td><c:out value="${lead.getPhoneno()}" /></td>
							<td><c:out value="${lead.getEmail()}" /></td>
							<td><c:out value="${lead.getUsername()}" /></td>
							<td><c:out value="${lead.getPassword()}" /></td>
							

							<td><a href ="edit?id=<c:out value='${lead.getId()}'/>"><button class="button" id="addBlog"><i class="fas fa-plus-circle"></i>Edit</button></a>
							 <a href ="delete?id=<c:out value='${lead.getId()}'/>"><button class="button" id="addBlog"><i class="fas fa-plus-circle"></i>Delete</button></a>
							 </td>

						</tr>
					</c:forEach>
				
				</tbody>

			</table>
			</div>
			</div>
</body>
</html>