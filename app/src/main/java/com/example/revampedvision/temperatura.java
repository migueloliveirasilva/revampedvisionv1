package com.example.revampedvision;

import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class temperatura extends AppCompatActivity implements Runnable {
ImageView img_temp, icon_temp;
TextView tv_temp1,tv_humi;
float temp,hum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura);
         img_temp = findViewById(R.id.img_term);
         icon_temp = findViewById(R.id.icon_temp);
         tv_temp1 = findViewById(R.id.tv_temp1);
         tv_humi = findViewById(R.id.tv_hum1);


        Handler handler = new Handler(); //contador de tempo
        handler.postDelayed(this, 60);
        //ligacao a base de daos
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        DatabaseReference databaseReference = firebaseDatabase.getReference("Dados");
        Dados dados = new Dados();


        // ------------------------------------------------ LEITURA ------------------------------------------------
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                float value = snapshot.child("Temperatura").getValue(Float.class);
                float value1 = snapshot.child("Humidade").getValue(Float.class);

                temp= (value);
                hum= (value1);
                setImg_temp(img_temp,icon_temp,tv_temp1,tv_humi);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(temperatura.this, error.toException().toString(), Toast.LENGTH_SHORT).show();

            }
        });
        /*------------------------------------------------ ESCRITA ------------------------------------------------
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                databaseReference.setValue(dados);
                Toast.makeText(temperatura.this, "data added", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(temperatura.this, "Fail to add data " + error, Toast.LENGTH_SHORT).show();
            }
        });*/
    }
    //comparacoes de temperatura
    public void setImg_temp(ImageView img_temp, ImageView icon_temp, TextView tv_temp1, TextView tv_humi)
    {
        if( temp  < 0 )
        {
            img_temp.setImageResource(R.drawable.t1);
            icon_temp.setImageResource(R.drawable.gelo);

        }
            else if(temp >= 0 & temp  < 5 )
        {
            img_temp.setImageResource(R.drawable.t2);
            icon_temp.setImageResource(R.drawable.gelo);

        }
            else if(temp >= 5 & temp  < 10 )
        {
            img_temp.setImageResource(R.drawable.t3);
            icon_temp.setImageResource(R.drawable.floco);
        }
            else if(temp >= 10 & temp  < 15 )
        {
            img_temp.setImageResource(R.drawable.t4);
            icon_temp.setImageResource(R.drawable.floco);

        }
            else if(temp >= 15 & temp  < 20 )
        {
            img_temp.setImageResource(R.drawable.t5);
            icon_temp.setImageResource(R.drawable.sol);

        }
            else    if(temp >= 20 & temp  < 25 )
        {
            img_temp.setImageResource(R.drawable.t6);
            icon_temp.setImageResource(R.drawable.sol);

        }
            else  if(temp >= 25 & temp  < 30 )
        {
            img_temp.setImageResource(R.drawable.t7);
            icon_temp.setImageResource(R.drawable.sol);

        }
            else if(temp >= 30 & temp  < 35 )
        {
            img_temp.setImageResource(R.drawable.t8);
            icon_temp.setImageResource(R.drawable.chama);
        }
            else  if(temp >= 35 & temp  < 40 )
        {
            img_temp.setImageResource(R.drawable.t9);
            icon_temp.setImageResource(R.drawable.chama);

        }
            else  if(temp >= 40 & temp  < 42 )
        {
            img_temp.setImageResource(R.drawable.t10);
            icon_temp.setImageResource(R.drawable.chama);

        }
            else   if(temp >= 40 & temp  < 42 )
        {
            img_temp.setImageResource(R.drawable.t10);
            icon_temp.setImageResource(R.drawable.chama);

        }
            else if(temp >= 42  )
        {
            img_temp.setImageResource(R.drawable.t11);
            icon_temp.setImageResource(R.drawable.caveira);


        }

        String text = new Float(temp).toString();
        tv_temp1.setText(text +"ºC");
        String text1 = new Float(hum).toString();
        tv_humi.setText(text1 + "%");
    }
    


    @Override
    public void run() {

        setImg_temp(img_temp,icon_temp,tv_temp1,tv_humi);
        
    }
}