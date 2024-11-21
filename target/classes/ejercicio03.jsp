<html>
<head>
  <title>Ejercicio 02</title>
</head>

<body>

   <h1>Tabla de Multiplicar</h1>

   <h3>Ingrese un número</h3>

   <form method="GET">
   <input type="number" name="numero" required>
   <button type="submit">Calcular</button>
   </form>

   <%
   String numStr = request.getParameter("numero");
   if(numStr != null) {
   int = Integer.parseInt(numStr);

   out.print("<h3>Resultados</h3>");
   out.print("<ul>");

   for ( int i=1 ; i<=10; i++) {

   out.print("<li>"+ numero + "X" + i + "=" + (numero * i) +"</li>");

   }

   out.print("</ul>");

   }
   %>

    <a href="./">Volver al Inicio</a>

</body>
</html>