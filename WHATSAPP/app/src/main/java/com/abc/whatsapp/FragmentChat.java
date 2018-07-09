package com.abc.whatsapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class FragmentChat extends Fragment {
    View v;
    private RecyclerView myRecyclerView;
    private  List<Chat>listChat;

    public FragmentChat() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.chat_fragment,container,false);
        myRecyclerView = (RecyclerView)v.findViewById(R.id.call_recyclerView);
        RecycleViewAdapter recycleViewAdapter = new RecycleViewAdapter(getContext(),listChat);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myRecyclerView.setAdapter(recycleViewAdapter);
                return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listChat = new ArrayList<>();
        listChat.add(new Chat("sambhav","hi",R.drawable.ic_cam));
        listChat.add(new Chat("sambhav","hi",R.drawable.ic_cam));
        listChat.add(new Chat("sambhav","hi",R.drawable.ic_cam));
        listChat.add(new Chat("sambhav","hi",R.drawable.ic_cam));
        listChat.add(new Chat("sambhav","hi",R.drawable.ic_cam));
        listChat.add(new Chat("sambhav","hi",R.drawable.ic_cam));
        listChat.add(new Chat("sambhav","hi",R.drawable.ic_cam));
        listChat.add(new Chat("sambhav","hi",R.drawable.ic_cam));
        listChat.add(new Chat("sambhav","hi",R.drawable.ic_cam));
        listChat.add(new Chat("sambhav","hi",R.drawable.ic_cam));
        listChat.add(new Chat("sambhav","hi",R.drawable.ic_cam));
        listChat.add(new Chat("sambhav","hi",R.drawable.ic_cam));
        listChat.add(new Chat("sambhav","hi",R.drawable.ic_cam));
    }
}
