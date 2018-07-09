package com.abc.whatsapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.MyViewHolder> {
    Context ctx;
    List<Chat> mData;

    public RecycleViewAdapter(Context ctx, List<Chat> mData) {
        this.ctx = ctx;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v= LayoutInflater.from(ctx).inflate(R.layout.item_chat,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_name.setText(mData.get(position).getName());
        holder.tv_message.setText(mData.get(position).getMessage());
        holder.img.setImageResource(mData.get(position).getPhoto());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tv_name;
        TextView tv_message;
        ImageView img;
        public MyViewHolder(View itemView) {


            super(itemView);
            tv_name=(TextView)itemView.findViewById(R.id.name_chat);
            tv_message=(TextView)itemView.findViewById(R.id.message_chat);
            img= (ImageView)itemView.findViewById(R.id.img_chat);
        }
    }
}
