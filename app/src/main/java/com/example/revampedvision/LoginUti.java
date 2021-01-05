package com.example.revampedvision;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginUti extends AppCompatActivity {
    EditText et_mail, et_password;
    Button bt_login;
    private FirebaseAuth mAuth;
    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_uti);
        et_mail = findViewById(R.id.et_login_email);
        et_password = findViewById(R.id.et_login_password);
        bt_login = findViewById(R.id.bt_login_entrar);
        mAuth = FirebaseAuth.getInstance();
        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = et_mail.getText().toString();
                String password = et_password.getText().toString();

                mAuth.signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener(LoginUti.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    // Sign in success, update UI with the signed-in user's information

                                    FirebaseUser user = mAuth.getCurrentUser();
                                    Intent i = new Intent(LoginUti.this,Menu.class);
                                    startActivity(i);

                                } else {
                                    // If sign in fails, display a message to the user.

                                    Toast.makeText(LoginUti.this, "Autenticação Errada",
                                            Toast.LENGTH_SHORT).show();

                                }


                            }
                        });





            }
        });

    }
}