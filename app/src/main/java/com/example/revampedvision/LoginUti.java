package com.example.revampedvision;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginUti extends AppCompatActivity {
 EditText et_utilizador, et_pass;
 Button bt_login;
 Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_uti);
        et_utilizador= findViewById(R.id.et_uti_login);
        et_pass = findViewById(R.id.et_pass_login);
        bt_login = findViewById(R.id.bt_log_login);
        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = getIntent();
                String utilizador = et_utilizador.getText().toString().trim();
                String pass = et_pass.getText().toString().trim();
                {
                    if(utilizador.equals(i.getExtras().getString("utilizador")) || pass.equals(i.getExtras().getString("pass")))
                    {
                        i = new Intent(LoginUti.this,Menu.class);
                        startActivity(i);
                    }
                    else
                        {
                            Toast.makeText(LoginUti.this, "Login Errado", Toast.LENGTH_SHORT).show();
                            et_utilizador.setText("");
                            et_pass.setText("");
                        }
                }
            }
        });
    }
}