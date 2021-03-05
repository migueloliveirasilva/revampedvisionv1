package com.example.revampedvision;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Login extends AppCompatActivity {

     Button bt_reg, bt_log;
     String uti = "admin@admin.com", pass = "mics139r";
     @Override
     protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data)
     {
         super.onActivityResult(requestCode,resultCode,data);
         if(requestCode == 1 && resultCode == 1 && data != null)
         {
            uti = data.getExtras().getString("utilizador");
             pass =data.getExtras().getString("password");
             Toast.makeText(this, "Dados de Login gravados", Toast.LENGTH_SHORT).show();

         }

     }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        bt_log= findViewById(R.id.bt_log);
        bt_reg= findViewById(R.id.bt_reg);
        //codigo do botao de login
        bt_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
                    
            {
                if(uti.equals("")|| pass.equals(""))
                {
                    Toast.makeText(Login.this, "Faça o registo antes de fazer login", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent i = new Intent(Login.this, LoginUti.class);
                    i.putExtra("uti", uti);
                    i.putExtra("pass", pass);

                    startActivity(i);
                }

            }
        }

        );
        // codigo do botao de registo
        bt_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {Intent i = new Intent(Login.this,Reg.class);
                startActivityForResult(i,1);
            }
        }

        );
    }
}