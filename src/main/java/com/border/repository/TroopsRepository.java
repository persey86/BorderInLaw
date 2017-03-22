package com.border.repository.impl;

import com.border.exceptions.TroopsRepositoryException;
import com.border.rows.Troops;
import com.border.utils.SqlUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created on 19.03.2017.
 */
public class TroopsRepository {

    public List<Troops> getAllTroops() throws TroopsRepositoryException {
        List<Troops> troops = new ArrayList<Troops>();
        Connection con = null;
        try {
            con = SqlUtils.getConnection();
            PreparedStatement pstm = con.prepareStatement(SqlUtils.SELECT_FROM_TROOPS);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()){
                Troops posts = new Troops();
                posts.setId(rs.getInt("id"));
                posts.setName(rs.getString("name"));
                troops.add(posts);
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw new TroopsRepositoryException("Error while getting All Troops", e);
        } finally {
            SqlUtils.closeConnection(con);
        }
        return troops;
    }
}
