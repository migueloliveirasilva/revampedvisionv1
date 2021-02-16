package com.example.revampedvision;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Menu extends AppCompatActivity implements View.OnClickListener{

    public CardView iluminacao,temperatura;
    ImageView iluminacao_img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        iluminacao = (CardView) findViewById(R.id.iluminacao);
        iluminacao.setOnClickListener(this);
        temperatura = (CardView) findViewById(R.id.temperatura);
        temperatura.setOnClickListener(this);
        iluminacao_img = findViewById(R.id.iluminacao_img);
    }




    @Override
    public void onClick(View v)
    {
        Intent i;
        switch (v.getId())
        {
            case R.id.iluminacao:
                i = new Intent (this, iluminacao.class);
                startActivity(i);
                break;
            case R.id.temperatura:
                i = new Intent(this, temperatura.class);
                startActivity(i);
                break;
        }



    }
}