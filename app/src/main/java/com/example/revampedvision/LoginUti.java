package com.example.revampedvision;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginUti extends AppCompatActivity {
    EditText et_mail, et_password;
    Button bt_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_uti);
        et_mail = findViewById(R.id.et_login_email);
        et_password = findViewById(R.id.et_login_password);
        bt_login = findViewById(R.id.bt_login_entrar);
        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginUti.this,Menu.class);
                startActivity(i);
            }
        });

    }
}