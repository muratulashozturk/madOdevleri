package com.ulash.surveyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    public TextView question2;
    public CheckBox answer1;
    public CheckBox answer2;
    public CheckBox answer3;
    public Button btnNext2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        question2 = findViewById(R.id.txtQuestion2);
        answer1 = findViewById(R.id.answer1); answer2 = findViewById(R.id.answer2); answer3 = findViewById(R.id.answer3);
        String answerOneYesOrNo = getIntent().getStringExtra("answerId");
        if(answerOneYesOrNo.equals("Evet")) {
            question2.setText("Peki, internet alışverişlerinizde hangi uygulamaları kullanıyorsunuz ?");
            answer1.setText("YemekSepeti"); answer2.setText("Getir"); answer3.setText("İsteGelsin");
        }
        else {
            question2.setText("Alışverişlerinizde hangi marketleri tercih ediyorsunuz ?");
            answer1.setText("Migros"); answer2.setText("CarrefourSA"); answer3.setText("BİM");
        }
        btnNext2 = findViewById(R.id.btnNext2);
        btnNext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goNext = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(goNext);
                finish();
            }
        });

    }
}