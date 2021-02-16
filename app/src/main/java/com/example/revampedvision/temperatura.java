package com.example.revampedvision;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class temperatura extends AppCompatActivity implements Runnable {
ImageView img_temp;
float temp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura);
         img_temp = findViewById(R.id.img_term);
        temp = (float) 40;
        Handler handler = new Handler(); //contador de tempo
        handler.postDelayed(this, 600000);// delay de 10 minutos

    }
    //comparacoes de temperatura
    public void setImg_temp(ImageView img_temp)
    {
        if(temp >= -5 & temp  < 0 )
        {
            img_temp.setImageResource(R.drawable.t1);
        }

    }

    @Override
    public void run() {

        setImg_temp(img_temp);
    }
}