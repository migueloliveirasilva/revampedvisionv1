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

public class humidade extends AppCompatActivity implements Runnable {
    ImageView gota;
    TextView humidadeplanta;
    Float humidade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_humidade);
        gota = findViewById(R.id.gota);
        humidadeplanta = findViewById(R.id.humidadeplanta);
        Handler handler = new Handler(); //contador de tempo
        handler.postDelayed(this, 60);
        //ligacao a base de dados
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        DatabaseReference databaseReference = firebaseDatabase.getReference("Dados");
        Dados dados = new Dados();
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                try {
                    float value = snapshot.child("HumidadePlanta").getValue(Float.class);
                    humidade = (value);
                    setGota(gota, humidadeplanta);
                } catch (Exception e) {
                    Toast.makeText(humidade.this, "", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(humidade.this, error.toException().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void setGota(ImageView gota, TextView humidadeplanta) {
        if (humidade >= 0 & humidade <= 5) {
            gota.setImageResource(R.drawable.h1);
        } else if (humidade >= 5 & humidade <= 15) {
            gota.setImageResource(R.drawable.h2);
        } else if (humidade >= 15 & humidade <= 25) {
            gota.setImageResource(R.drawable.h3);
        } else if (humidade >= 25 & humidade <= 35) {
            gota.setImageResource(R.drawable.h4);
        } else if (humidade >= 35 & humidade <= 45) {
            gota.setImageResource(R.drawable.h5);
        } else if (humidade >= 45 & humidade <= 55) {
            gota.setImageResource(R.drawable.h7);
        } else if (humidade >= 55 & humidade <= 65) {
            gota.setImageResource(R.drawable.h8);
        } else if (humidade >= 65 & humidade <= 75) {
            gota.setImageResource(R.drawable.h9);
        } else if (humidade >= 75 & humidade <= 85) {
            gota.setImageResource(R.drawable.h10);
        } else if (humidade >= 85 & humidade <= 95) {
            gota.setImageResource(R.drawable.h11);
        } else if (humidade >= 95 & humidade <= 100) {
            gota.setImageResource(R.drawable.h12);
        }
        String text2 = Float.toString(humidade);
        humidadeplanta.setText(text2 + "%");
    }

    @Override
    public void run() {
        setGota(gota, humidadeplanta);
    }
}