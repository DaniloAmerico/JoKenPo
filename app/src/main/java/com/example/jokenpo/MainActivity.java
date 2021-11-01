package com.example.jokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void selecionadoPedra(View view)
    {
        this.opçãoSelecionada("Pedra");
    }

    public void selecionadoPapel(View view)
    {
        this.opçãoSelecionada("Papel");
    }

    public void selecionadoTesoura(View view)
    {
        this.opçãoSelecionada("Tesoura");
    }

    public void opçãoSelecionada(String opcaoUsuario)
    {
        ImageView result =  findViewById(R.id.result);
        TextView text1 = findViewById(R.id.text1);



        int numero = new Random().nextInt(3);

        System.out.print("Selecionado " + opcaoUsuario);
        String[] opcoes = {"Pedra","Papel","Tesoura"};
        String opcaoApp = opcoes[numero];

        switch(opcaoApp)
        { case "Pedra" :
            result.setImageResource(R.drawable.pedra);
            break;

         case "Papel" :
             result.setImageResource(R.drawable.papel);
            break;

         case "Tesoura" :
             result.setImageResource(R.drawable.tesoura);
            break;
        }
        if (
                (opcaoApp == "Pedra" && opcaoUsuario =="Tesoura") ||
                (opcaoApp == "Papel" && opcaoUsuario =="Pedra")   ||
                (opcaoApp == "Tesoura" && opcaoUsuario =="Papel")
        )
        {//App ganhador
        text1.setText("Você perdeu! :(");
        }
        else if (
                (opcaoApp == "Tesoura" && opcaoUsuario =="Pedra") ||
                (opcaoApp == "Pedra" && opcaoUsuario =="Papel")   ||
                 (opcaoApp == "Papel" && opcaoUsuario =="Tesoura")
        ) {//Usuário ganhador
        text1.setText("Você Ganhou! :)");
        }
        else {//Empate
        text1.setText("Empatamos! =/");
            }
    }

}
