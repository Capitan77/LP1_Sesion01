package com.cibertec;

//Servlet para recuperar el Listado que exista en la
// base de datos que creamos en SQLserver

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


@WebServlet (name="UsuariosServlet", urlPatterns = "/UsuariosServlet")
public class UsuarioServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);

        //Una Lista usuarios que encapsula más Listas de datos
        List<String[]> listaUsuarios = new ArrayList<>();

        try {
            //permite establecer una conexión con la base de datos
            Connection connection = DBConnection.getConnection();

            //permite ejecutar consultas en SQL como SELECT
            Statement statement = connection.createStatement();

            //captura los resultados de SQL
            ResultSet resultSet = statement.executeQuery("SELECT id, nombre, email FROM Usuarios");

            while(resultSet.next()){

                //creamos una lista para recuperar los datos del usuario
                 String[] actualUsuario = new String[3];
                 actualUsuario[0] = String.valueOf(resultSet.getInt("id"));
                 actualUsuario[1] = resultSet.getString("nombre");
                 actualUsuario[2] = resultSet.getString("email");

                 //almacenamos los usuarios que hemos obtenido en la lista general
                 listaUsuarios.add(actualUsuario);

            }
        } catch (SQLException e){
           //falta manejar el error
        } catch(ClassNotFoundException e) {
            //falta manejar el error
        }

        //creando una solicitud a quien le vamos a enviar una lista de usuarios
        req.setAttribute("usuarios",listaUsuarios);
        // todo esto lo vamos a enviar al archivo usuarios.jsp
        RequestDispatcher dispatcher = req.getRequestDispatcher("usuarios.jsp");
        //y lo retorna
        dispatcher.forward(req,resp);
    }
}
