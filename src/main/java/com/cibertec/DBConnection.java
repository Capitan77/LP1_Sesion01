package com.cibertec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {


    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=cibertec;encrypt=false";

    private static final String USER = "sa";

    private static final String PASS = "sql";



    public static Connection getConnection() throws SQLException, ClassNotFoundException {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        return DriverManager.getConnection(URL, USER, PASS);

    }
}
