package com.example.fanel.g2;

/**
 * Created by Fanel on 3/13/2017.
 */

import java.text.SimpleDateFormat;
import java.util.Date;


public class Masina {
    String nume;
    Number pret;
    Date dataFabric;
    static SimpleDateFormat formatDate=new SimpleDateFormat("dd/MM/yyyy");

    Masina(){
        nume="BMW";
        pret=5000;
        dataFabric= new Date();
    }

    Masina(String nume, Number pret, Date dataFabric){
        this.nume=nume;
        this.pret=pret;
        this.dataFabric=dataFabric;
    }
    public String toString(){
        return nume+" "+"la pretul de " + pret+"$ fabircata la data "+formatDate.format(dataFabric);
    }

}
