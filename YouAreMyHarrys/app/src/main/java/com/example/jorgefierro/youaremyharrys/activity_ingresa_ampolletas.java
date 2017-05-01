package com.example.jorgefierro.youaremyharrys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class activity_ingresa_ampolletas extends AppCompatActivity {
    ImageView btnevaluar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresa_ampolletas);
        btnevaluar = (ImageView) findViewById(R.id.btnevaluar);
        btnevaluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent i = new Intent(activity_ingresa_ampolletas.this,activity_paso2.class);
                    startActivity(i);
            }
        });
    }
}
