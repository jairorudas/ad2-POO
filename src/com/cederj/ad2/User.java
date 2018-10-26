package com.cederj.ad2;

import java.util.ArrayList;

public class User {
    private  int idade ;
    private  String nome;
    public static ArrayList<User> users = new ArrayList<User>();

    User(){};

    User(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    };

    public User updateFollowers(String nome){

    }

    public User updateFollow(String nome){

    }

}
