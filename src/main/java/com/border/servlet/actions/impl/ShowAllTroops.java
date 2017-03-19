package com.border.servlet.actions.impl;

import com.border.repository.impl.TroopsRepository;
import com.border.rows.Troops;
import com.border.servlet.actions.Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Anastasia on 19.03.2017.
 */
public class ShowAllTroops implements Action {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {


        TroopsRepository troopsRepository = new TroopsRepository();
        List<Troops> allTroops = troopsRepository.getAllTroops();

        request.setAttribute( "troops", allTroops);
        return "index";
    }
}
