package com.abc.viewpagerwhatsappui;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MyUserAdapter extends RecyclerView.Adapter<MyUserAdapter.MyViewHolder> {

    private ArrayList<user>userArrayList;
    private Context context;
    public MyUserAdapter(ArrayList<user>users, FragmentChat ctx)
    {
        userArrayList = users;
        context = ctx;

    }
    @NonNull
    @Override
    public MyUserAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater lif = LayoutInflater.from(context);
        View inflatedView = lif.inflate(R.layout.item_row,parent,false);

        return new MyViewHolder(inflatedView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyUserAdapter.MyViewHolder holder, int position)
    {
        user currentuser = userArrayList.get(position);
        holder.name.setText(currentuser.getName());
        holder.name.setText(currentuser.getMessage());

    }

    @Override
    public int getItemCount() {
        return userArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name,message;
        public MyViewHolder(View itemView)
        {
            super(itemView);
            name = itemView.findViewById(R.id.userName);
            message = itemView.findViewById(R.id.userMsg);

        }
    }
}
