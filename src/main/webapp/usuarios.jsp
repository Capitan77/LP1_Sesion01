<%@ page contentType="text/html;charset-UTF-8" lenguage="java"%>
<!DOCTYPE html>
<html>
<head>
  <title>Lista de Usuarios</title>
</head>

<body>
 <h1>Lista de Usuarios</h1>

 <br></br>

<div>
<%
 List<String[]> usuarios =(List<String[]>) request.getAttribute("usuarios");

if(usuarios >= null){
for(String[] item: usuarios){
out.print["<p> id: "+ item[0] + ", nombre: "+ item[1] +", email: "+ item[2] +"</p>"]
}
}

%>
</div>


</body>
</html>