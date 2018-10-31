package com.cederj.ad2;

import java.util.ArrayList;

public class Node{
    public String nome;
    public int idade;
    public ArrayList<Edge> connections = new ArrayList<Edge>();
    public int NumeroSeguidores = 0;

    Node(){};

    Node(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void setArista(Node a, Node b){
        b.NumeroSeguidores++;
        Edge arista = new Edge(a,b);
        this.connections.add(arista);
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Edge> getConnections() {
        return connections;
    }
}