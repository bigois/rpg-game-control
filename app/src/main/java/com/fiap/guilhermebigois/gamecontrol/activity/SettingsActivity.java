package com.fiap.guilhermebigois.gamecontrol.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.fiap.guilhermebigois.gamecontrol.R;
import com.fiap.guilhermebigois.gamecontrol.adapter.UserAdapter;
import com.fiap.guilhermebigois.gamecontrol.model.User;

import java.util.ArrayList;
import java.util.List;

public class SettingsActivity extends AppCompatActivity {
    private Button btnSubmit;
    private Button btnExit;
    private EditText txtNickname;
    private EditText txtEmail;
    private RecyclerView recyclerView;
    private UserAdapter adapter;
    private ArrayList<User> usersList;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        
        btnExit = findViewById(R.id.btnExit);
        btnSubmit = findViewById(R.id.btnSubmit);
        txtNickname = findViewById(R.id.txtNickname);
        txtEmail = findViewById(R.id.txtEmail);
        recyclerView = findViewById(R.id.rclUserList);
    
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayout);
    
        setListData();
        
        adapter = new UserAdapter(this, usersList);
        recyclerView.setAdapter(adapter);
        
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
                    Toast.makeText(getApplicationContext(), getString(R.string.settings_message_empty_fields), Toast.LENGTH_SHORT).show();
                } else {
                    usersList.add(new User(nickname, email));
    
                    Toast.makeText(getApplicationContext(), getString(R.string.settings_message_success), Toast.LENGTH_LONG).show();
                    
                    adapter.notifyDataSetChanged();
                }
            }
        });
    }
    
    private void setListData() {
        usersList = new ArrayList<User>();
        
        usersList.add(new User("fhyragomn", "mayer.jonh@outlook.com"));
        usersList.add(new User("shyeirush", "guttenberg.martin@yahoo.com"));
        usersList.add(new User("rocaah", "smith.lary@gmail.com"));
        usersList.add(new User("thiegradenn", "johnsons.jannet@hotmail.com"));
        usersList.add(new User("madinf", "valendorf.leonor@live.com"));
        usersList.add(new User("gunbolt", "stevenson.gustaff@bol.com"));
    }
    
    
}
