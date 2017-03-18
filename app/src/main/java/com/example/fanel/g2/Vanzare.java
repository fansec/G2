package com.example.fanel.g2;

/**
 * Created by Fanel on 3/13/2017.
 */

import java.util.ArrayList;


public class Vanzare {
    String identificator,marca;
    ArrayList<Masina> lista;

    Vanzare(String id, String mc, int nr){
        identificator=id;
        marca=mc;
        lista= new ArrayList<Masina>(nr);
    }
    public String toString(){
        StringBuffer sirDeAfisat=new StringBuffer();
        sirDeAfisat.append(identificator+" - "+marca+"\n");
        for(Masina p:lista) {
            sirDeAfisat.append("   ");
            sirDeAfisat.append(p);
            sirDeAfisat.append("\n");
        }
        return sirDeAfisat.toString();
    }

}

