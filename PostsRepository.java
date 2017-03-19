package com.border.repository.impl;

import com.border.rows.Posts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created on 19.03.2017.
 */
public class PostsRepository {
       private Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");

           return DriverManager.getConnection("jdbc:mysql://localhost:3306/BorderGuardService", "root", "root");
    }
    public List<Posts> getAllPosts() throws ClassNotFoundException,SQLException{
        Connection con = null;
        List<Posts> allPosts = new ArrayList<>();
        try {
            con = getConnection();
            PreparedStatement pstm = con.prepareStatement("SELECT * FROM posts");
        }
        finally {
            con.close();
        }
        return allPosts;
    }
}
