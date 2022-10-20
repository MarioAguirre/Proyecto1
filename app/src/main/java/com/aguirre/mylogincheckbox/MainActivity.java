package com.aguirre.mylogincheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irSiguiente(View view){
        Intent i = new Intent(this, Activity_Secondary.class);
        startActivity(i);
    }

    public void abrirNuevoIntent(View view){
        Intent i = new Intent(this, activity_intent_mario_aguirre.class);
        startActivity(i);
    }

}