package com.fiap.guilhermebigois.gamecontrol.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.fiap.guilhermebigois.gamecontrol.activity.CharRegistrationActivity;
import com.fiap.guilhermebigois.gamecontrol.R;

public class CharsFragment extends Fragment {
    private Button btnCharRegister;
    private View myView;
    
    public CharsFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.fragment_chars, container, false);
        btnCharRegister = myView.findViewById(R.id.btnCharRegister);
        
        btnCharRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CharRegistrationActivity.class);
                startActivity(intent);
            }
        });
        
        return myView;
    }
}
