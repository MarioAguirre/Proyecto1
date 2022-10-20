package com.aguirre.mylogincheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity_Secondary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
    }

    public void irProgres (View view){
        Intent i = new Intent(this, SecondProgressBar.class);
        startActivity(i);
    }
}