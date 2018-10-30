package com.cederj.ad2;

import java.util.ArrayList;
import java.util.Iterator;

public class TGrafo {

    public static ArrayList<User> users = new ArrayList<User>();
    private static String mostPopular;

    //questão 1
    public static int numero_Seguidores(String nome){
        return 1;
    }

    //Questão 2
    public static void seguidores(String nome){

    }

    //Questão 3
    public void calculateMaisPopular(){
        this.mostPopular = "";
    }

    //questão 4
    public int segue_mais_velho(){
        return users.size();
    }

    public static void addUser(User u){
        users.add(u);
    }

    public static String getMostPopular() {
        return mostPopular;
    }


    public void updateFollowers(String name, String followers){
        for (Iterator<User> iterator = users.iterator(); iterator.hasNext(); ) {
            User u = iterator.next();
            if (name == u.getNome()){
                u.updateFollowers(u);
            }
        }


    }

    public void updateIFollow(String nome, String Ifollow){

    }


}
