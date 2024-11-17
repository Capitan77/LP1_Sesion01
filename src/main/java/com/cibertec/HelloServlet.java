package com.cibertec;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


//se vuelve un servlet gracias a la extensión
public class HelloServlet extends HttpServlet {


    //Llamamos al metodo do "Get" por medio de " ALT + INS " para modificarlo
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // super.doGet(req, resp);

        //cada vez que un usuario ingrese al "HellServlet" te lanzará un saluda HTML
           resp.setContentType("text/html");
           resp.getWriter().println("<h1>Hola desde HelloServlet</h1>");
           resp.getWriter().println("<p>Este es un mensaje guiado ginámicamente</p>");

    }
}
