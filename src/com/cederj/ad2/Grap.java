package com.cederj.ad2;

import java.util.ArrayList;
import java.util.Iterator;

public class Grap {


    public  ArrayList<Node> nodes = new ArrayList<Node>();

    Grap(){};

    public Node findNode(String nome){
        Node finded = null;
//        for (int i = 0; i < nodes.size(); i++){
//            if (nome.equals(nodes.get(i).getNome()) ) {
//                finded = nodes.get(i);
//
//            }
//        }
//
//        return finded;
//
//       for(Node n : nodes){
//            if (nome.equals(n.getNome())) {
//                finded =  n;
//            }
//        }
//
//        return finded;

        for (Iterator<Node> iterator = this.nodes.iterator(); iterator.hasNext(); ) {
            Node n = iterator.next();
            if(nome.toLowerCase().equals(n.getNome())){
                finded = n;
                break;
            }
          }
        return finded;
    }

    public void setArista(String nomeA, String nomeB){
        Node user1 = this.findNode(nomeA.toLowerCase());
        Node user2 = this.findNode(nomeB.toLowerCase());

        user1.setArista(user1, user2);
    }

}
