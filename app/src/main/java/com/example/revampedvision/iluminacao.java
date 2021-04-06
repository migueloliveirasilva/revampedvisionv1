package com.example.revampedvision;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class iluminacao extends AppCompatActivity {
    SwitchCompat switchCompat;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
                    databaseReference.child("led_STATUS").setValue("ON");
                } else {
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.light_off));
                    databaseReference.child("led_STATUS").setValue("OFF");
                }

                  
            }
        });
    }
}


