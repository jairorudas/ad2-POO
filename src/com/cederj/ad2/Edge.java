package com.cederj.ad2;


import java.util.ArrayList;

public class Edge {
    public Node start;
    public Node end;
    public double weight;

    Edge(){};

    Edge(Node a, Node b){
        this.start = a;
        this.end = b;
    }
}
