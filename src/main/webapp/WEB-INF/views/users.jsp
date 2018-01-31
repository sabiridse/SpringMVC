<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Users</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script crossorigin src="https://unpkg.com/react@16/umd/react.production.min.js"></script>
<script crossorigin src="https://unpkg.com/react-dom@16/umd/react-dom.production.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/babel-standalone/6.25.0/babel.min.js"></script>
</head>
<body onload="load();">
	<div id="app"> APP </div>
	<script type="text/javascript" src="js/js1.js"></script>
     <script type="text/babel" src="js/react.js"></script>   
     <link rel="stylesheet" href="css/test1.css" type="text/css" />
      
   
 
        <input type="hidden" id="user_id">
        Name: <input type="text" id="name" required="required" name="user_name"><br>
        Email: <input type="email" id="email" required="required" name="email"><br>
 
	        <button id="but1" onclick="submit()">Submit</button>
	        <button onClick={react()}>REACT</button>
	        <button onClick={rereact()}>NOREACT</button>
     
     
     
 
        <table id="table" border=1>
            <tr> <th> Name </th> <th> Email </th> <th> Edit </th> <th> Delete </th> </tr>
         
        </table>
        
             
     
     
     <br>
     <form action="main" method="post">
					<p><input class="naviButon" type="submit" value="НА ГЛАВНУЮ">
	</form>	
     <!-- <br>
    <br>
    <h2>
        <a href="/SpringMVC/">Возврат на главную</a>
    </h2> -->
     <div id="test1" >1</div>
     
</body>
</html>