package com.example.revampedvision;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class led extends AppCompatActivity implements View.OnClickListener {
    Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt10, bt11, bt12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_led);
        bt1 = findViewById(R.id.bt1);
        bt1.setOnClickListener(this);
        bt2 = findViewById(R.id.bt2);
        bt2.setOnClickListener(this);
        bt3 = findViewById(R.id.bt3);
        bt3.setOnClickListener(this);
        bt4 = findViewById(R.id.bt4);
        bt4.setOnClickListener(this);
        bt5 = findViewById(R.id.bt5);
        bt5.setOnClickListener(this);
        bt6 = findViewById(R.id.bt6);
        bt6.setOnClickListener(this);
        bt7 = findViewById(R.id.bt7);
        bt7.setOnClickListener(this);
        bt8 = findViewById(R.id.bt8);
        bt8.setOnClickListener(this);
        bt9 = findViewById(R.id.bt9);
        bt9.setOnClickListener(this);
        bt10 = findViewById(R.id.bt10);
        bt10.setOnClickListener(this);
        bt11 = findViewById(R.id.bt11);
        bt11.setOnClickListener(this);
        bt12 = findViewById(R.id.bt12);
        bt12.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        DatabaseReference databaseReference = firebaseDatabase.getReference("Dados");

        if (v.getId() == R.id.bt1)
            databaseReference.child("Cor").setValue("branco");
        else if (v.getId() == R.id.bt2)
            databaseReference.child("Cor").setValue("amarelo");
        else if (v.getId() == R.id.bt3)
            databaseReference.child("Cor").setValue("amarelo");
        else if (v.getId() == R.id.bt4)
            databaseReference.child("Cor").setValue("amarelo");
        else if (v.getId() == R.id.bt4)
            databaseReference.child("Cor").setValue("amarelo");
        else if (v.getId() == R.id.bt5)
            databaseReference.child("Cor").setValue("amarelo");
        else if (v.getId() == R.id.bt6)
            databaseReference.child("Cor").setValue("amarelo");
        else if (v.getId() == R.id.bt7)
            databaseReference.child("Cor").setValue("amarelo");
        else if (v.getId() == R.id.bt8)
            databaseReference.child("Cor").setValue("amarelo");
        else if (v.getId() == R.id.bt9)
            databaseReference.child("Cor").setValue("amarelo");
        else if (v.getId() == R.id.bt10)
            databaseReference.child("Cor").setValue("amarelo");
        else if (v.getId() == R.id.bt11)
            databaseReference.child("Cor").setValue("amarelo");
        else if (v.getId() == R.id.bt12)
            databaseReference.child("Cor").setValue("amarelo");
    }
}