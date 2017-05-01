package com.example.jorgefierro.youaremyharrys;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Paso1Activity extends AppCompatActivity {
    ImageView btncomenzar;
    ImageView btnrevisarconsumo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paso1);
        btnrevisarconsumo = (ImageView)findViewById(R.id.btnrevisarconsumo);
        btnrevisarconsumo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Paso1Activity.this,MainActivity.class);
                startActivity(i);
            }
        });
        btncomenzar = (ImageView) findViewById(R.id.btncomenzar);
        btncomenzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Paso1Activity.this,activity_ingresa_ampolletas.class);
                startActivity(i);
            }
        });
    }
}
