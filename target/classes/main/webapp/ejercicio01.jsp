<!--lenguaje que vamos a usar -->
<%@ page contentType="text/html;charset-UTF-8" lenguage="java"%>
<!DOCTYPE html>
<html>
<head>
  <title>Ejercicio 01</title>
</head>

<body>

    <h1>Suma y Multiplicación</h1>


    <%
    int  a = 5;
    int b = 10;
    int suma = a + b;
    int multiplicacion = a * b;
    %>

    <p>El resultado de la suma es : <%= suma%></p>
    <p>El resultado de la multiplicación es : <%= multiplicacion%></p>

    <a href="./">Volver al Inicio</a>

</body>
</html>