package com.fiap.guilhermebigois.gamecontrol.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.fiap.guilhermebigois.gamecontrol.R;

public class NPCRegistrationActivity extends AppCompatActivity {
    private Button btnNPCBack;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_npc);
        
        btnNPCBack = findViewById(R.id.btnNPCBack);
        btnNPCBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
