package com.cederj.ad2;

import java.util.ArrayList;
import java.util.Iterator;

public class Grap {

    public static ArrayList<Node> nodes = new ArrayList<Node>();


    public static Node findNode(String nome){
        Node finded = new Node();

        for (Iterator<Node> iterator = nodes.iterator(); iterator.hasNext(); ) {
            Node n = iterator.next();
            if (nome == n.getNome()) {
                System.out.println(n.getNome());
            }
        }

        return finded;

    }

    public static void setArista(String nomeA, String nomeB){

        Node nodeA = findNode(nomeA);
        Node nodeB = findNode(nomeB);

        nodeA.setArista(nodeA,nodeB);
    }

    public static ArrayList<Node> getNodes() {
        return nodes;
    }
}
