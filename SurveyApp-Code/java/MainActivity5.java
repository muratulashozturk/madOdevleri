package com.ulash.surveyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {
    public Button btnFinish;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        btnFinish = findViewById(R.id.btnFinish);
        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity5.this, "YANITLARINIZ GÖNDERİLMİŞTİR. İYİ GÜNLER DİLERİZ.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}