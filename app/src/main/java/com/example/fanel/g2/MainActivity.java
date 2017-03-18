package com.example.fanel.g2;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.ParseException;

import static com.example.fanel.g2.Masina.formatDate;

public class MainActivity extends AppCompatActivity {
    TextView deAfisat;
    Button b;
    Vanzare m1,m2;


    void setVanzare(){
        try {
            m1 = new Vanzare("RO", "Autovit", 3);
            m1.lista.add(new Masina("BMW", 6000,formatDate.parse("07/11/2006")));
            m1.lista.add(new Masina("FIAT", 7600,formatDate.parse("09/11/2014")));
            m1.lista.add(new Masina("Audi", 8000,formatDate.parse("22/2/2008")));
            m2 = new Vanzare("RO", "OLX", 3);
            m2.lista.add(new Masina("Mercedes", 5000,formatDate.parse("10/10/2000")));
            m2.lista.add(new Masina("Ferrari", 10000,formatDate.parse("22/12/1995")));
            m2.lista.add(new Masina("Skoda", 5000,formatDate.parse("12/12/2005")));
        }  catch (ParseException e) {
            e.printStackTrace();
        }
    }
    void metodaButon(View v){
        deAfisat.setText(m1.toString()+"\n\n"+m2.toString());
    }
    void metodaRadioButton(View view){
        if(view.getId()==R.id.radioButton1)
            deAfisat.setText(m1.toString());
        if(view.getId()==R.id.radioButton2)
            deAfisat.setText(m2.toString());
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setVanzare();
        deAfisat=(TextView)findViewById(R.id.textView);
        b=(Button)findViewById(R.id.button);
    }
}
