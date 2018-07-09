package com.abc.instaui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MyfeedAdapter extends RecyclerView.Adapter<MyfeedAdapter.MyViewHolder> {
    private ArrayList<feed>feedArrayList;
    private Context context;
    public MyfeedAdapter(ArrayList<feed>feeds,Context ctx)
    {
        feedArrayList = feeds;
        context = ctx;

    }
    @NonNull
   @Override
    public MyViewHolder oncreateViewHolder(@NonNull ViewGroup parent,int viewType)
    {


        LayoutInflater lif = LayoutInflater.from(context);
        View inflatedView = lif.inflate(R.layout.feed, parent, false);
        return new MyViewHolder(inflatedView);

    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position)
    {
        feed currentfeed = feedArrayList.get(position);
        holder.name.setText(currentfeed.getName());
        holder.location.setText(currentfeed.getLocation());
        holder.imageUrl.setText(currentfeed.getImageUrl());
    }
    @Override
    public int getItemCount(){return  feedArrayList.size();}

    class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView name, location,imageUrl;
     public MyViewHolder (View itemView)
     {
         super(itemView);
         name = itemView.findViewById(R.id.name);
         location = itemView.findViewById(R.id.location);
         imageUrl = itemView.findViewById(R.id.imageView);


     }

    }
}
