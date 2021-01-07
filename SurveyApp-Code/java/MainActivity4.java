package com.ulash.surveyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {
    public Button btnNext4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        btnNext4 = findViewById(R.id.btnNext4);
        btnNext4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goNext4 = new Intent(MainActivity4.this,MainActivity5.class);
                startActivity(goNext4);
                finish();
            }
        });
    }
}