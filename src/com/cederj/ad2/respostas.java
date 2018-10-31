package com.cederj.ad2;

import java.util.ArrayList;

public class respostas {

    public static int  numero_seguidores (Grap g, String nome){
        return g.findNode(nome).NumeroSeguidores;
    };

    public static void seguidores (Grap g, String nome){
        Node seguidores = g.findNode(nome);

        for(Edge seg : seguidores.connections){
            System.out.println(seg.end.getNome());
        }

    };

    public static String mais_popular (Grap g){
        Node mostPopular = null;


        for(int i = 0; i < g.nodes.size(); i++ ){
            if (i == 0){
                mostPopular = g.nodes.get(i);
            }
            else{
                if (mostPopular.connections.size() < g.nodes.get(i).connections.size()){
                    mostPopular = g.nodes.get(i);
                }
            }
        }
        return mostPopular.getNome();
    };

    public static void seegue_mais_velho(Grap g){

    };
}
