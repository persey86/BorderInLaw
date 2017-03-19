package com.border.repository.impl;

import com.border.rows.Troops;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created on 19.03.2017.
 */
public class TroopsRepository {
    private Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/BorderGuardService", "root", "root");
    }
    public List<Troops> getAllTroops() throws SQLException, ClassNotFoundException {
        List<Troops> troops = new ArrayList<Troops>();
        Connection con = null;
        try {
            con = getConnection();
            PreparedStatement pstm = con.prepareStatement("SELECT * FROM troops");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()){
                Troops posts = new Troops();
                posts.setId(rs.getInt("id"));
                posts.setName(rs.getString("name"));
                troops.add(posts);
            }
        }finally {
            con.close();
        }
        return troops;
    }
}
