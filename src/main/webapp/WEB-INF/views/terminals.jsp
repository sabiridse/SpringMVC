<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="false" %>
<jsp:useBean id="terminals" class="com.entities.Terminals"/>
<jsp:useBean id="terminalsDaoImpl" class="com.daoimpl.TerminalsImpl"/>
<html>
<head>
	<title>Home</title>
	<style type="text/css">
		.button{
			height: 60%;
			width: 90%;
			margin-left: 1%;
			background-color:#363636;
			color: #BDB76B	
		}
		.buttonMenu{
			height: 40px;
			width: 90%;
			margin-left: 5px;
			background-color:#363636;
			color: #BDB76B
		
		}
	</style>
	
</head>
<body style="color:#B5B5B5;">


		
		<div style="border: 1px solid black;height:8%;background-color:#363636">
			<div style="float: left; height:100%;width:10%;">
				<p><input type="submit" value="ТЕРМИНАЛЫ" class="button">
			</div>
			<div style="float: left; height:100%;width:10%;">
				<p><input type="submit" value="ОШИБКИ" class="button">
			</div>
			<div style="float: left; height:100%;width:10%;">
				<p><input type="submit" value="ПОИСК" class="button">
			</div>
			<div style="float: left; height:100%;width:10%;">
				<p><input type="submit" value="ПОИСК" class="button">
			</div>
			<div style="float: left; height:100%;width:10%;">
				<form action="main" method="post">
					<p><input type="submit" value="НА ГЛАВНУЮ" class="button">
				</form>	
			</div>
		</div>
		
		
		
		
		<div style="height:87%;background-color:#708090">		
				<div style="float: left; height:100%;width:10%;background-color:#363636">
					<div style="height:10%;">
						<form action="find" method="post"> 
						  	<br>
						  	<input type="text" name="serchTerm" style="line-height: 30px; width: 90%; font-size: 20px; margin-left: 5px;">
						  	<br>
						  	<p><input type="submit" value="ПОИСК" class="buttonMenu">
						</form>				
					</div>			
				</div>			
				<div style="float: left; height:100%;width:90%;">	
					<table cellspacing="1" border="1" cellpadding="1" width=100% style="height: 50px; font-size: 20px; color: #BDB76B">


				<tr>
								    <th width=10%>НОМЕР</th>
								    <th width=60%>ТЕРМИНАЛ</th>
								    <th width=10%>МАРШРУТ</th>
								    <th width=20%>ПРИМЕЧАНИЕ</th>
				   				</tr>
			   				    <c:forEach items="${terms}" var="terms">
			   				    <tr>
			   				  	    <td>${terms.idTerm}</td>
				   				    <td>${terms.nameTerm}</td>
				   				    <td>${terms.nameDistr}</td>
				   				    <td>${terms.other}</td>
				   			   </tr>
				   			   </c:forEach>							   
				   </table>
				</div>		
		</div>
		<div style="border: 1px solid black;height:5%;background-color:#363636">
		</div>
	<br>
    <br>


</body>
</html>