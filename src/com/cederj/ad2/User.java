package com.cederj.ad2;

import java.util.ArrayList;

public class User {
    private  int idade ;
    private  String nome;
    public  ArrayList<User> followers = new ArrayList<User>();
    public  ArrayList<User> follow = new ArrayList<User>();


    User(){};

    User(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    };

    public  ArrayList<User> getFollowers() {
        return this.followers;
    }

    public ArrayList<User> getFollow() {
        return follow;
    }

    public String getNome() {
        return nome;
    }

    public void updateFollowers(User f){
        followers.add(f);

    }

    public void updateIFollow(String nome, String Ifollow){

    }
}
