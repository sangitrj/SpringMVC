<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
      <title>spring</title>
   </head>
   <body>
   	<form action="home" method="post">
   		<input type="text" placeholder="User name" name="name"><br><br>
   		<input type="password" placeholder="Password" name="password"><br><br>
   		<input type="text" placeholder="Code" name="code"><br><br>
   		<input type="submit" value="login"> <font style="color: red;"> ${message} </font>
   	</form>
   </body>
</html>