package com.border.rows;

import java.util.Date;

/**
 * Created by Anastasia on 19.03.2017.
 */
public class Posts {
    private Integer id;
    private String nameOfPost;
    private String postHead;
    private String nearCity;
    private Integer capableCity;
    private Date lastInspect;
    private Integer tax;
    private Integer troops_id;

    public Integer getId(){
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameOfPost(){
        return nameOfPost;
    }

    public void setNameOfPost(String nameOfPost) {
        this.nameOfPost = nameOfPost;
    }
    public String getPostHead(){
        return postHead;
    }

    public void setPostHead(String postHead) {
        this.postHead = postHead;
    }

    public String getNearCity(){
        return nearCity;
    }
    public void setNearCity(String nearCity){
        this.nearCity = nearCity;
    }
    public Integer getCapableCity(){
        return capableCity;
    }

    public void setCapableCity(Integer capableCity) {
        this.capableCity = capableCity;
    }

    public Date getLastInspect() {
        return lastInspect;
    }

    public void setLastInspect(Date lastInspect) {
        this.lastInspect = lastInspect;
    }

    public Integer getTax() {
        return tax;
    }

    public void setTax(Integer tax) {
        this.tax = tax;
    }

    public Integer getTroops_id() {
        return troops_id;
    }

    public void setTroops_id(Integer troops_id) {
        this.troops_id = troops_id;
    }
}
