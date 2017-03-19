package com.border.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Anastasia on 19.03.2017.
 */
public class SqlUtils {

    private SqlUtils(){}

    public static final String SELECT_FROM_TROOPS = "SELECT * FROM troops";

    public static final String SELECT_FROM_POSTS = "SELECT * FROM posts";



    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/solarsystem", "root", "root");
    }


    public static void closeConnection(Connection con) {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error while closing connection");
            }
        }
    }
}
