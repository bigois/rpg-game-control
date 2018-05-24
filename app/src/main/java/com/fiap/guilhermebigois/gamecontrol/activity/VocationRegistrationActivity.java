package com.fiap.guilhermebigois.gamecontrol.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.fiap.guilhermebigois.gamecontrol.R;

public class VocationRegistrationActivity extends AppCompatActivity {
    private Button btnVocationBack;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_vocation);
        
        btnVocationBack = findViewById(R.id.btnVocationBack);
        btnVocationBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
