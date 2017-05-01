package com.example.jorgefierro.youaremyharrys;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.media.Image;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    ImageView imgtop;
    ImageView imageviewrayo;
    ConstraintLayout layout_clayout;
    TextView txtviewporcentaje;
    TextView txtViewcantApolletas;
    TextView textViewhoramin;
    TextView textViewCiudad;
    ImageView imagebtncambiarfondo;
    static final int REQUEST_ENABLE_BT=100;
    static int i =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniciar();
    }

    private void iniciar(){
        imageviewrayo=(ImageView)findViewById(R.id.imageviewrayo);
        layout_clayout = (ConstraintLayout)findViewById(R.id.layout_clayout);
        imgtop = (ImageView)findViewById(R.id.imageViewTop);
        txtviewporcentaje =(TextView)findViewById(R.id.txtviewporcentaje);
        txtViewcantApolletas = (TextView)findViewById(R.id.txtViewcantApolletas);
        textViewhoramin = (TextView)findViewById(R.id.textViewhoramin);
        textViewCiudad =(TextView)findViewById(R.id.textViewCiudad);
        imagebtncambiarfondo=(ImageView)findViewById(R.id.imagebtncambiarfondo);
        imagebtncambiarfondo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
                if (mBluetoothAdapter != null) {
                    if (!mBluetoothAdapter.isEnabled()) {
                        Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                        startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);
                    }else{
                        Toast.makeText(MainActivity.this,"Bluethoot no activado",Toast.LENGTH_SHORT).show();

                    }
                }

            }
        });

    }

    private void cambiaDatos(String porc,String cantampolleta,String horamin){
        txtviewporcentaje.setText(porc);
        txtViewcantApolletas.setText(cantampolleta);
        textViewhoramin.setText(horamin);
    }

    private  void setRayo(boolean rayo){
        imageviewrayo.setVisibility((rayo)? View.VISIBLE:View.INVISIBLE);

    }

    private void sun(){
        imgtop.setImageResource(R.drawable.sun);
        layout_clayout.setBackgroundColor(ContextCompat.getColor(this, R.color.colorFondoSun));
    }
    private void cloud(){

        imgtop.setImageResource(R.drawable.cloud);

        layout_clayout.setBackgroundColor(ContextCompat.getColor(this, R.color.colorFondocloud));
    }
    private void rain(){

        imgtop.setImageResource(R.drawable.rain);

        layout_clayout.setBackgroundColor(ContextCompat.getColor(this, R.color.colorFondorain));
    }
    private void noche(){

        imgtop.setImageResource(R.drawable.noche);

        layout_clayout.setBackgroundColor(ContextCompat.getColor(this, R.color.colorFondonoche));
    }
}
