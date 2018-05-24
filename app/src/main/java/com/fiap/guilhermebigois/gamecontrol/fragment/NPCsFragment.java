package com.fiap.guilhermebigois.gamecontrol.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.fiap.guilhermebigois.gamecontrol.R;
import com.fiap.guilhermebigois.gamecontrol.activity.NPCRegistrationActivity;

public class NPCsFragment extends Fragment {
    private Button btnNPCRegister;
    private View myView;
    
    public NPCsFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.fragment_npcs, container, false);
        
        btnNPCRegister = myView.findViewById(R.id.btnNPCRegister);
        btnNPCRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), NPCRegistrationActivity.class);
                startActivity(intent);
            }
        });
        
        return myView;
    }
}
