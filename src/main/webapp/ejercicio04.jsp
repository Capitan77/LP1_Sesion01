<%@ page contentType="text/html;charset-UTF-8" lenguage="java"%>
<!DOCTYPE html>
<html>
<head>
  <title>Saludo Personalizado</title>
</head>

<body>

  <h1>Ingresa tu nombre</h1>

 <h4>GET</h4>
  <form action="SaludoServlet" method="GET">
  <input type="text" name="nombre" placeholder="Ingresa tu nombre" required>
  <button type="submit">Enviar</button>
  </form>

  <hr>

 <h4>POST</h4>
    <form action="SaludoServlet" method="POST">
    <input type="text" name="nombre" placeholder="Ingresa tu nombre" >
    <button type="submit">Enviar</button>
    </form>



</body>
</html>