package com.ulash.surveyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public Button NextBtn;
    public RadioGroup rdYesNoGroup;
    public RadioButton radioButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NextBtn = findViewById(R.id.btnNext1);
        rdYesNoGroup = (RadioGroup)findViewById(R.id.evet_hayir_radio_group);
        NextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent passData = new Intent(MainActivity.this,MainActivity2.class);
                int selectedID = rdYesNoGroup.getCheckedRadioButtonId();
                radioButton = (RadioButton) findViewById(selectedID);
//                Toast.makeText(MainActivity.this, radioButton.getText(), Toast.LENGTH_SHORT).show();
                passData.putExtra("answerId", radioButton.getText());
                startActivity(passData);
                finish();
            }
        });
    }

}
