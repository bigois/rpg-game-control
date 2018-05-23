package com.fiap.guilhermebigois.gamecontrol.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.fiap.guilhermebigois.gamecontrol.R;

public class UserViewHolder extends RecyclerView.ViewHolder {
    public TextView txtLayoutNickname;
    public TextView txtLayoutEmail;
    
    public UserViewHolder(View itemView) {
        super(itemView);
        
        txtLayoutNickname = itemView.findViewById(R.id.txtLayoutNickname);
        txtLayoutEmail = itemView.findViewById(R.id.txtLayoutEmail);
    }
}
