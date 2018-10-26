package com.cederj.ad2;

import java.util.ArrayList;

public class TGrafo {

    ArrayList<User> users;
    private static String mostPopular;

    TGrafo(){};

    TGrafo(User u){
        this.users.add(u);
        this.calculateMostPopular();
    }

    //Questão 3
    private void calculateMostPopular(){
        this.mostPopular = "";
    }


    public void updateFollowers(String name, ArrayList<String> followers){

    }

    public static String getMostPopular() {
        return mostPopular;
    }
}
