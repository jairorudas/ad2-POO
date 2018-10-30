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
        File fileName = new java.io.File(home + "/IdeaProjects/cederj-ad2/src/com/cederj/ad2/users.txt");
	    String line = null;


	    try{
            FileReader filereader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(filereader);

            Node user;

            while ((line = bufferedReader.readLine()) !=  null){
                String[] data = line.split("\\s");
                char number  = data[1].charAt(0);

                if(Character.isDigit(number) && data != null){
                    user = new Node(data[0], Integer.parseInt(data[1]));
                    Grap.nodes.add(user);

                } else {
                  Grap.setArista(data[0], data[1]);
                }
            }

            Node usr = Grap.findNode("Bruna");

            //System.out.println(usr.connections);

            bufferedReader.close();
        }
        catch(FileNotFoundException fl){
	        System.out.println("Não foi possivel abrir o arquivo '" + fileName + "'");
        }
        catch(IOException ex){
            System.out.println("Error ao ler o arquivo '" + fileName + "'");
        }
    }
}
