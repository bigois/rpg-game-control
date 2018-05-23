package com.fiap.guilhermebigois.gamecontrol.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fiap.guilhermebigois.gamecontrol.R;
import com.fiap.guilhermebigois.gamecontrol.model.User;
import com.fiap.guilhermebigois.gamecontrol.viewholder.UserViewHolder;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserViewHolder> {
    private Context context;
    private List<User> users;
    
    public UserAdapter(Context context, List<User> users) {
        this.context = context;
        this.users = users;
    }
    
    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.layout_settings, parent, false);
        UserViewHolder viewHolder = new UserViewHolder(view);
        
        return viewHolder;
    }
    
    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        if (users != null && users.size() > 0) {
            User user = users.get(position);
    
            holder.txtLayoutNickname.setText(user.getNickname());
            holder.txtLayoutEmail.setText(user.getEmail());
        }
    }
    
    @Override
    public int getItemCount() {
        return users.size();
    }
}
