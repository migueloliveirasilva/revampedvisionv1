package com.example.revampedvision;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class led extends AppCompatActivity {
Button bt1, bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12;
String Cor1 = "branco";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_led);
        bt1  = findViewById(R.id.bt1);
        bt2  = findViewById(R.id.bt2);
        bt3  = findViewById(R.id.bt3);
        bt4  = findViewById(R.id.bt4);
        bt5  = findViewById(R.id.bt5);
        bt6  = findViewById(R.id.bt6);
        bt7  = findViewById(R.id.bt7);
        bt8  = findViewById(R.id.bt8);
        bt9  = findViewById(R.id.bt9);
        bt10  = findViewById(R.id.bt10);
        bt11  = findViewById(R.id.bt11);
        bt12  = findViewById(R.id.bt12);
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        DatabaseReference databaseReference = firebaseDatabase.getReference("Dados");
        Dados dados = new Dados();

        bt1.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       databaseReference.addValueEventListener(new ValueEventListener() {
                                           @Override
                                           public void onDataChange(@NonNull DataSnapshot snapshot) {
                                               databaseReference.setValue(String.class);
                                               Cor1 = snapshot.child("Cor").setValue(String.class);
                                               Toast.makeText(led.this, "data added", Toast.LENGTH_SHORT).show();
                                           }

                                           @Override
                                           public void onCancelled(@NonNull DatabaseError error) {
                                               Toast.makeText(led.this, "Fail to add data " + error, Toast.LENGTH_SHORT).show();
                                           }
                                       });
                                   }
                               }


        );
    }
}