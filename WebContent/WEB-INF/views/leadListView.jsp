<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

 <meta charset="UTF-8" />
    <title>ADD ITEMS</title>
   <link type="text/css" rel="stylesheet" href="./css/lead.css">
   
</head>
<body>
 <nav>
        <img src="./css/logo.png" alt="logo" />
        <ul>
             <li> <a href="${pageContext.request.contextPath}/login">Login</a></li>
            <li> <a href="${pageContext.request.contextPath}/signup">Sign Up</a></li>
           
        </ul>
    </nav>
    
   <div class="addform">
   
         <form action="new" method="post">
    <label for="id">Lead Id</label>
    <input type="text"  name="id" >

    <label for="name">Lead Name</label>
    <input type="text"  name="name" >

    <label for="gender">Lead Gender</label>
    <input type="text"  name="gender" >
    
       <label for="address">Lead Address</label>
    <input type="text"  name="address" >

    <label for="phoneno">Lead PhoneNo</label>
     <input type="text" name="phoneno">

    <label for="email">Lead Email</label>
    <input type="text" name="email" >
    
      <label for="username">Lead Username</label>
    <input type="text"  name="username" >
    
       <label for="password">Lead Password</label>
    <input  type="text" name="password" >

     <button class="button"><i class="fas fa-plus-circle"></i>Add Lead</button>
     
  </form>
  </div>
  
</body>
</html>