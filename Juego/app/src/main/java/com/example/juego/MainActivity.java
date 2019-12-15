package com.example.juego;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button[][] botones = new Button[3][3];
    private boolean turnoJugador1 = true;
    private int rondaContador;
    private int puntoJugador1;
    private int puntoJugador2;
    private TextView textoJugador1;
    private TextView textoJugador2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoJugador1=findViewById(R.id.texto1);
        textoJugador2=findViewById(R.id.texto2);

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                String botonID = "btn_" + i + j;
                int recursoID = getResources().getIdentifier(botonID, "id", getPackageName());
                botones[i][j] = findViewById(recursoID);
                botones[i][j].setOnClickListener(this);
            }
        }
        Button btnreset = findViewById(R.id.btnreset);
        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reiniciarJuego();
            }
        });
    }

    @Override
    public void onClick(View v) {
        if (!((Button) v).getText().toString().equals("")){
            return;
        }

        if (turnoJugador1){
            ((Button) v).setText("X");
        } else {
            ((Button) v).setText("O");
        }
        rondaContador++;

        if(comprobar()){
            if(turnoJugador1){
                ganaJugador1();
            } else {
                ganaJugador2();
            }
        } else if (rondaContador == 9){
            dibujar();
        } else {
            turnoJugador1 = !turnoJugador1;
        }
    }

    private boolean comprobar(){
        String[][] campo = new String[3][3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                campo[i][j] = botones[i][j].getText().toString();
            }
        }

        for(int i = 0; i < 3; i++){
            if(campo[i][0].equals(campo[i][1])
                    && campo[i][0].equals(campo[i][2])
                    && !campo[i][0].equals("")){
                return true;
            }
        }

        for(int i = 0; i < 3; i++){
            if(campo[0][i].equals(campo[1][i])
                    && campo[0][i].equals(campo[2][i])
                    && !campo[0][i].equals("")){
                return true;
            }
        }

        if(campo[0][0].equals(campo[1][1])
                && campo[0][0].equals(campo[2][2])
                && !campo[0][0].equals("")){
            return true;
        }

        if(campo[0][2].equals(campo[1][1])
                && campo[0][2].equals(campo[2][0])
                && !campo[0][2].equals("")){
            return true;
        }
        return false;
    }

    private void ganaJugador1(){
        puntoJugador1++;
        Toast.makeText(this, "Jugador 1 gana", Toast.LENGTH_SHORT).show();
        puntoJugadores();
        reiniciarMarcador();
    }

    private void ganaJugador2(){
        puntoJugador2++;
        Toast.makeText(this, "Jugador 2 gana", Toast.LENGTH_SHORT).show();
        puntoJugadores();
        reiniciarMarcador();
    }

    private void dibujar(){
        Toast.makeText(this, "No hubieron ganadores", Toast.LENGTH_SHORT).show();
        reiniciarMarcador();
    }

    private void puntoJugadores(){
        textoJugador1.setText("Jugador 1: " + puntoJugador1);
        textoJugador2.setText("Jugador 2: " + puntoJugador2);
    }

    private void reiniciarMarcador(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                botones[i][j].setText("");
            }
        }
        rondaContador = 0;
        turnoJugador1 = true;
    }

    private void reiniciarJuego(){
        Toast.makeText(this, "Juego Reiniciado", Toast.LENGTH_SHORT).show();
        puntoJugador1 = 0;
        puntoJugador2 = 0;
        puntoJugadores();
        reiniciarMarcador();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("rondaContador", rondaContador);
        outState.putInt("puntoJugador1", puntoJugador1);
        outState.putInt("puntoJugador2", puntoJugador2);
        outState.putBoolean("turnoJugador1", turnoJugador1);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        rondaContador = savedInstanceState.getInt("rondaContador");
        puntoJugador1 = savedInstanceState.getInt("puntoJugador1");
        puntoJugador2 = savedInstanceState.getInt("puntoJugador2");
        turnoJugador1 = savedInstanceState.getBoolean("turnoJugador1");
    }
}
