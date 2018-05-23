package com.fiap.guilhermebigois.gamecontrol.activity;

import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.fiap.guilhermebigois.gamecontrol.R;

public class SettingsActivity extends AppCompatActivity {
    private Button btnSubmit;
    private Button btnExit;
    private EditText txtNickname;
    private EditText txtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        
        btnExit = findViewById(R.id.btnExit);
        btnSubmit = findViewById(R.id.btnSubmit);
        txtNickname = findViewById(R.id.txtNickname);
        txtEmail = findViewById(R.id.txtEmail);
        
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nickname = txtNickname.getText().toString();
                String email = txtEmail.getText().toString();
                
                if(nickname.isEmpty() || email.isEmpty()) {
                    Toast.makeText(getApplicationContext(), getString(R.string.settings_error_empty_fields), Toast.LENGTH_SHORT).show();
                } else {
                    // IMPLEMENT SAVE DATA METHOD
                }
            }
        });
    }
    
    
}
