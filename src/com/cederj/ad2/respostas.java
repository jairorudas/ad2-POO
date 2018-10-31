package com.cederj.ad2;

import java.util.ArrayList;

public class respostas {

    public static int  numero_seguidores (Grap g, String nome){
        return g.findNode(nome).connections.size();
    };

    public static void seguidores (Grap g, String nome){
        Node seguidores = g.findNode(nome);

        for(Edge seg : seguidores.connections){
            System.out.println(seg.end.getNome());
        }

    };

    public static String mais_popular (Grap g){
        Node mostPopular;

        return "";
    };

    public static void seegue_mais_velho(Grap g){

    };
}
