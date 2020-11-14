package com.example.revampedvision;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Reg extends AppCompatActivity {
    private ViewHolder mViewHolder = new ViewHolder();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        mViewHolder.et_email=findViewById(R.id.et_registo_email);
        mViewHolder.et_password=findViewById(R.id.et_registo_password);
        mViewHolder.et_passwordrep =findViewById(R.id.et_registo_password1);
        mViewHolder.bt_registar=findViewById(R.id.bt_registo_registar);
        mViewHolder.bt_registar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
    private class ViewHolder
    {
        EditText et_email, et_password, et_passwordrep;
        Button bt_registar;
    }


}