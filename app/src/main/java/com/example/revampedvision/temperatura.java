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
        temp = (float) -2;
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
            tv_temp1.setText(text +"ºC");
        }

    }
    public void setImg_temp1(ImageView img_temp, ImageView icon_temp, TextView tv_temp1)
    {
        if(temp >= 0 & temp  < 5 )
        {
            img_temp.setImageResource(R.drawable.t2);
            icon_temp.setImageResource(R.drawable.gelo);
            String text = new Float(temp).toString();
            tv_temp1.setText(text +"ºC");
        }

    }
    public void setImg_temp2(ImageView img_temp, ImageView icon_temp, TextView tv_temp1)
    {
        if(temp >= 5 & temp  < 10 )
        {
            img_temp.setImageResource(R.drawable.t3);
            icon_temp.setImageResource(R.drawable.floco);
            String text = new Float(temp).toString();
            tv_temp1.setText(text +"ºC");
        }

    }
    public void setImg_temp3(ImageView img_temp, ImageView icon_temp, TextView tv_temp1)
    {
        if(temp >= 10 & temp  < 15 )
        {
            img_temp.setImageResource(R.drawable.t4);
            icon_temp.setImageResource(R.drawable.floco);
            String text = new Float(temp).toString();
            tv_temp1.setText(text +"ºC");
        }

    }
    public void setImg_temp4(ImageView img_temp, ImageView icon_temp, TextView tv_temp1)
    {
        if(temp >= 15 & temp  < 20 )
        {
            img_temp.setImageResource(R.drawable.t5);
            icon_temp.setImageResource(R.drawable.sol);
            String text = new Float(temp).toString();
            tv_temp1.setText(text +"ºC");
        }

    }
    public void setImg_temp5(ImageView img_temp, ImageView icon_temp, TextView tv_temp1)
    {
        if(temp >= 20 & temp  < 25 )
        {
            img_temp.setImageResource(R.drawable.t6);
            icon_temp.setImageResource(R.drawable.sol);
            String text = new Float(temp).toString();
            tv_temp1.setText(text +"ºC");
        }

    }
    public void setImg_temp6(ImageView img_temp, ImageView icon_temp, TextView tv_temp1)
    {
        if(temp >= 25 & temp  < 30 )
        {
            img_temp.setImageResource(R.drawable.t7);
            icon_temp.setImageResource(R.drawable.sol);
            String text = new Float(temp).toString();
            tv_temp1.setText(text +"ºC");
        }

    }
    public void setImg_temp7(ImageView img_temp, ImageView icon_temp, TextView tv_temp1)
    {
        if(temp >= 30 & temp  < 35 )
        {
            img_temp.setImageResource(R.drawable.t8);
            icon_temp.setImageResource(R.drawable.chama);
            String text = new Float(temp).toString();
            tv_temp1.setText(text +"ºC");
        }

    }
    public void setImg_temp8(ImageView img_temp, ImageView icon_temp, TextView tv_temp1)
    {
        if(temp >= 35 & temp  < 40 )
        {
            img_temp.setImageResource(R.drawable.t9);
            icon_temp.setImageResource(R.drawable.chama);
            String text = new Float(temp).toString();
            tv_temp1.setText(text +"ºC");
        }

    }
    public void setImg_temp9(ImageView img_temp, ImageView icon_temp, TextView tv_temp1)
    {
        if(temp >= 40 & temp  < 42 )
        {
            img_temp.setImageResource(R.drawable.t10);
            icon_temp.setImageResource(R.drawable.chama);
            String text = new Float(temp).toString();
            tv_temp1.setText(text +"ºC");
        }

    }
    public void setImg_temp10(ImageView img_temp, ImageView icon_temp, TextView tv_temp1)
    {
        if(temp >= 42 & temp  < 45 )
        {
            img_temp.setImageResource(R.drawable.t11);
            icon_temp.setImageResource(R.drawable.caveira);
            String text = new Float(temp).toString();
            tv_temp1.setText(text +"ºC")
            ;
        }

    }



    @Override
    public void run() {

        setImg_temp(img_temp,icon_temp,tv_temp1);
        setImg_temp1(img_temp,icon_temp,tv_temp1);
        setImg_temp2(img_temp,icon_temp,tv_temp1);
        setImg_temp3(img_temp,icon_temp,tv_temp1);
        setImg_temp4(img_temp,icon_temp,tv_temp1);
        setImg_temp5(img_temp,icon_temp,tv_temp1);
        setImg_temp6(img_temp,icon_temp,tv_temp1);
        setImg_temp7(img_temp,icon_temp,tv_temp1);
        setImg_temp8(img_temp,icon_temp,tv_temp1);
        setImg_temp9(img_temp,icon_temp,tv_temp1);
        setImg_temp10(img_temp,icon_temp,tv_temp1);


    }
}