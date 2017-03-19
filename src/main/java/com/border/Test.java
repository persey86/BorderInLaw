package com.border;

import com.border.exceptions.TroopsRepositoryException;
import com.border.repository.impl.TroopsRepository;
import com.border.rows.Troops;

import java.util.List;

/**
 * Created by Anastasia on 19.03.2017.
 */
public class Test {
    public static void main(String[] args) throws TroopsRepositoryException {
//        PostsRepository postsRepository = new PostsRepository();
//        List<Posts> allPosts = postsRepository.getAllPosts();
//        System.out.println("number of posts: " +allPosts.size());


        TroopsRepository troopsRepository = new TroopsRepository();
        List<Troops> allTroops = troopsRepository.getAllTroops();
        System.out.println("numbers of troops" + allTroops);

    }

}
