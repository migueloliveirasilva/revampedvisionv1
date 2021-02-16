package com.example.revampedvision;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

public class temperatura extends AppCompatActivity implements Runnable {
ImageView img_temp, icon_temp;
TextView tv_temp1;
float temp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura);
         img_temp = findViewById(R.id.img_term);
         icon_temp = findViewById(R.id.icon_temp);
         tv_temp1 = findViewById(R.id.tv_temp1);
        temp = (float) -4;
        Handler handler = new Handler(); //contador de tempo
        handler.postDelayed(this, 60);

    }
    //comparacoes de temperatura
    public void setImg_temp(ImageView img_temp, ImageView icon_temp, TextView tv_temp1)
    {
        if(temp >= -5 & temp  < 0 )
        {
            img_temp.setImageResource(R.drawable.t1);
            icon_temp.setImageResource(R.drawable.gelo);
            String text = new Float(temp).toString();
            tv_temp1.setText(text);
        }

    }

    @Override
    public void run() {

        setImg_temp(img_temp,icon_temp,tv_temp1);
    }
}