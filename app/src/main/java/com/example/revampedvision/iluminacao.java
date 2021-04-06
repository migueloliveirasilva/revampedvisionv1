package com.example.revampedvision;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class iluminacao extends AppCompatActivity {
    SwitchCompat switchCompat;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
     /   super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iluminacao);
        switchCompat = findViewById(R.id.switchButton);
        imageView = findViewById(R.id.imageView);
        imageView.setImageDrawable(getResources().getDrawable(R.drawable.light_off));
        //ligacao a base de dados
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        DatabaseReference databaseReference = firebaseDatabase.getReference("Dados");
        Dados dados = new Dados();

        switchCompat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (switchCompat.isChecked()) {
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.light_on));
                    databaseReference.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            String value = snapshot.child("led_STATUS").getValue(String.class);
                            Toast.makeText(iluminacao.this, value, Toast.LENGTH_SHORT).show();
                            dados.setLED_STATUS("ON");

                            databaseReference.setValue(dados);


                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }


                    });

                } else {
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.light_off));
                    dados.setLED_STATUS("OFF");
                    databaseReference.setValue(dados);
                }
            }

                });



        }
    }

    
