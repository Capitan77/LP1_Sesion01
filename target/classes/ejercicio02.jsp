<!--lenguaje que vamos a usar -->
<%@ page contentType="text/html;charset-UTF-8" lenguage="java"%>
<!DOCTYPE html>
<html>
<head>
  <title>Ejercicio 02</title>
</head>

<body>

   <h1>Recibir Parámetros</h1>

   <form method="GET">
       <label>
            Nombre : <input type="text" name="nombre">
       </label>
       <br>
       <label>
            Edad : <input type="number" name="edad">
       </label>
       <br>
       <button type="submit">Enviar</button>
   </form>

<%
      String name = request.getParameter("nombre");
      String age = request.getParameter("edad");

      if(name != null  && age != null) {
      //mostrarle la informacion al usuario si lleno los campos

      %>

      <p>Nombre Ingresado: <%= name%></p>
      <p>Edad Ingresado: <%= age%></p>

      <%
      }
   %>


    <a href="./">Volver al Inicio</a>

</body>
</html>