package com.fiap.guilhermebigois.gamecontrol.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fiap.guilhermebigois.gamecontrol.R;

public class CreaturesFragment extends Fragment {
    public CreaturesFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_creatures, container, false);
    }
}
