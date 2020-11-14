package com.example.revampedvision;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Reg extends AppCompatActivity {
        EditText et_uti,et_pass;
        Button bt_regis;
        Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);

        et_uti=findViewById(R.id.et_uti);
        et_pass = findViewById(R.id.et_pass);
        bt_regis = findViewById(R.id.bt_regis);

        bt_regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String utilizador = et_uti.getText().toString().trim();
                String password = et_uti.getText().toString().trim();
                if(utilizador.equals("")||password.equals(""))
                {
                    Toast.makeText(Reg.this, "Insira algo nos campos de registo", Toast.LENGTH_SHORT).show();

                }
                else{
                    i=getIntent();
                    i.putExtra("utilizador",utilizador);
                    i.putExtra("pass",password);
                    setResult(1,i);
                    finish();

                }
            }
        }
        );


    }
}