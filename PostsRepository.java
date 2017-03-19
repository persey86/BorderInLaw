package com.border.repository.impl;

import com.border.rows.Posts;
import com.border.utils.SqlUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 * Created on 19.03.2017.
 */
public class PostsRepository {



    public List<Posts> getAllPosts() throws ClassNotFoundException,SQLException{
        Connection con = null;
        List<Posts> allPosts = new ArrayList<>();
        try {
            con = SqlUtils.getConnection();
            PreparedStatement pstm = con.prepareStatement(SqlUtils.SELECT_FROM_POSTS);
            ResultSet resultSet = pstm.executeQuery();
            while (resultSet.next()){
                Posts posts = new Posts();

//                posts.setId("id");
//                posts.setNameOfPost("nameOfpost");
//                posts.setPostHead("postHead");
//                posts.setNearCity("nearCity");
//                posts.setCapableCity("capabileCity");
//                posts.setLastInspect("lastInspect");
//                posts.setTax("tax");
//                posts.setTroops_id("troops_id");
                allPosts.add(posts);
            }
        }
        finally {
           SqlUtils.closeConnection(con);
        }
        return allPosts;
    }
}
