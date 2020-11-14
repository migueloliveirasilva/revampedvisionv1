package com.example.revampedvision;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        //simular o inicio do processo
        progressBar.setVisibility(View.VISIBLE);
        //simular o fim do processo
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run()
            {
                progressBar.setVisibility(View.GONE);
                Intent i = new Intent(MainActivity.this,Login.class);
                startActivity(i);
            }
        },3000);



    }

    private void init()
    {
        this.progressBar = findViewById(R.id.progressBar);
    }
}