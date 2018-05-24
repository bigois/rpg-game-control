package com.fiap.guilhermebigois.gamecontrol.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.fiap.guilhermebigois.gamecontrol.R;
import com.fiap.guilhermebigois.gamecontrol.activity.VocationRegistrationActivity;

public class VocationsFragment extends Fragment {
    private Button btnVocationRegister;
    private View myView;
    
    public VocationsFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.fragment_vocations, container, false);
        
        btnVocationRegister = myView.findViewById(R.id.btnVocationRegister);
        btnVocationRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), VocationRegistrationActivity.class);
                startActivity(intent);
            }
        });
        
        return myView;
    }
}
