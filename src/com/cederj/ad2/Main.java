package com.cederj.ad2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;

public class Main {

    public static void main(String[] args) {
        String home;
        home = System.getProperty("user.home");
        File fileName = new java.io.File(home + "/IdeaProjects/cederj-ad2/src/com/cederj/ad2/users-bkp.txt");
	    String line = null;
	    Grap grafo = new Grap();


	    try{
            FileReader filereader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(filereader);
            Node user;

            while ((line = bufferedReader.readLine()) !=  null){
                String[] data = line.split("\\s");
                char number  = data[1].charAt(0);

                if(Character.isDigit(number) && data != null){
                    user = new Node(data[0].toLowerCase(), Integer.parseInt(data[1]));
                    grafo.nodes.add(user);

                } else {
                    grafo.setArista(data[0], data[1]);
                }
            }


            bufferedReader.close();
        }
        catch(FileNotFoundException fl){
	        System.out.println("Não foi possivel abrir o arquivo '" + fileName + "'");
        }
        catch(IOException ex){
            System.out.println("Error ao ler o arquivo '" + fileName + "'");
        }

        // Resposta para pergunta 1
        System.out.println("O numero de seguidores é: ");
        System.out.println(respostas.numero_seguidores(grafo, "pedro"));

        // Resposta para pergunta 2
        System.out.println("Os seguidores desse user são: ");
        respostas.seguidores(grafo, "Renata");

        // Resposta para pergunta 3
        System.out.println("Pessoa mais popular é: ");
        System.out.println(respostas.mais_popular(grafo));


    }
}
