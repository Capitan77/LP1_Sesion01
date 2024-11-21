package com.cibertec;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

//Coneccion con el usuario -- garcias a JAKARTA en POM.XML
@WebServlet("/SaludoServlet")

public class SaludoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);

        //aqui vamos a recuperar el nombre que es enviado desde ejercicio04.jsp
        String nombre = req.getParameter("nombre");

        //Imprimimos mensaje con el nombre recuperado con HTML
        resp.setContentType("text/html");
        resp.getWriter().println("<h1>°Hola, "+ nombre +"</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // super.doPost(req, resp);

        //aqui vamos a recuperar el nombre que es enviado desde ejercicio04.jsp
        String nombre = req.getParameter("nombre");

        if(nombre == null || nombre == ""){
            nombre = "INVITADO";
        }

        //Imprimimos mensaje con el nombre recuperado con HTML
        resp.setContentType("text/html");
        resp.getWriter().println("<h1>°Hola, "+ nombre +"</h1>");
    }
}
