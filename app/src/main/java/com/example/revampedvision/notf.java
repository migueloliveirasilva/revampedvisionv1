package com.example.revampedvision;

import android.app.NotificationChannel;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class notf extends AppCompatActivity {
TextView tv_chama, tv_agua;
String Chama,Agua;
    private NotificationChannel notificationChannel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notf);
        tv_chama = findViewById(R.id.tv_chama);
        tv_agua = findViewById(R.id.tv_agua);

        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        DatabaseReference databaseReference = firebaseDatabase.getReference("Dados");
        Dados dados = new Dados();


        final ValueEventListener valueEventListener = databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                try {
                    String value = snapshot.child("Chama").getValue(String.class);
                    String value2 = snapshot.child("Agua").getValue(String.class);

                    Chama = value;
                    Agua = value2;

                    if (Chama.equals("alerta")) {
                        tv_chama.setText("Encontra se a decorrer um incêndio");
                    } else {
                        tv_chama.setText("Não se encontram a decorrer incêndios");
                    }
                    if (Agua.equals("alerta")) {
                        tv_agua.setText("Encontra se a decorrer uma inundação");
                    } else
                        tv_agua.setText("Não se encontram a decorrer inundações");


                } catch (Exception e) {

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(notf.this, error.toException().toString(), Toast.LENGTH_SHORT).show();

            }
        });


    }
}