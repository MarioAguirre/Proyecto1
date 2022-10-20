package com.aguirre.mylogincheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class activity_intent_mario_aguirre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_mario_aguirre);
    }

    public void abrirNueva(View view){
        Intent i = new Intent(this, activity_intent_mario_aguirre.class);
        startActivity(i);
    }

    public void abrirWhatsap(View view){
        Intent i;
        PackageManager manager = getPackageManager();
        try {
            i = manager.getLaunchIntentForPackage("com.android.chrome");
            if (i == null)
                throw new PackageManager.NameNotFoundException();
            i.addCategory(Intent.CATEGORY_LAUNCHER);
            startActivity(i);
        } catch (PackageManager.NameNotFoundException e) {

            //Si no se encuentra en el dispositivo.
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.google.com/"));
            startActivity(intent);
        }

    }

    public void realizarBusqueda(View view){
        Intent i= new Intent(Intent.ACTION_WEB_SEARCH );
        i.putExtra(SearchManager.QUERY, "Intent y activities");
        startActivity(i);

    }

    public void contactosDirectorio(View view){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("content://contacts/people/"));
        startActivity(i);

    }
}