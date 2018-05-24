package com.fiap.guilhermebigois.gamecontrol.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.fiap.guilhermebigois.gamecontrol.R;
import com.fiap.guilhermebigois.gamecontrol.activity.CreatureRegistrationActivity;

public class CreaturesFragment extends Fragment {
    private Button btnCreatureRegister;
    private View myView;
    
    public CreaturesFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.fragment_creatures, container, false);
        
        btnCreatureRegister = myView.findViewById(R.id.btnCreatureRegister);
        btnCreatureRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(getActivity(), CreatureRegistrationActivity.class);
                startActivity(intent);
            }
        });
        
        return myView;
    }
}
