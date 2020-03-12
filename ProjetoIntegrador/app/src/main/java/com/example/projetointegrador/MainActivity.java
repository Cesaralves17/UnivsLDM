package com.example.projetointegrador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button botaoSortear;
    private EditText textoDigitado;


    private String[] equipe1 = {"Sara", "Alicia", "Lara" };
    private String[] equipe2 = {"Alan", "Danylo", "Victor" , "Felipe" };
    private String[] equipe3 = {"Matheus", "De Cellis", "Suennaby" , "Jorge", "Augusto", "Thiago" };
    private String[] equipe4 = {"Gabriel", "Lucas", "Fabricio", "Bruno", "Eduardo" };
    private String[] equipe5 = {"Icaro", "Vinicius", "Thayrone", "Carlos" , "hyago"};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoSortear = findViewById(R.id.bt_sorteio);
        textoDigitado = findViewById(R.id.tf_numero);

        botaoSortear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!textoDigitado.getText().toString().isEmpty());
                int numero = Integer.parseInt(textoDigitado.getText().toString());
                String nome;
                if(numero >= 1 && <= 5){
                    if(numero == 1) {
                        nome = equipe1[new Random().nextInt(equipe1.length)];
                    }else if(numero == 2) {
                        nome = equipe2[new Random().nextInt(equipe2.length)];
                    }else if(numero == 3){
                        nome = equipe3[new Random().nextInt(equipe3.length)];
                    }else if(numero == 4){
                        nome = equipe4[new Random().nextInt(equipe4.length)];
                    }else if(numero == 5){
                        nome = equipe5[new Random().nextInt(equipe5.length)];
                    }


                }
        });


            Toast.makeText(this, nome,Toast.LENGTH_LONG).show();


        }
    }
}
