package com.abc.viewpagerwhatsappui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FragmentChat extends Fragment {
    ArrayList<user>userArrayList = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        {
        View view = inflater.inflate(R.layout.chat,container,false);
        userArrayList.add(new user("sambhav", "hi"));
        userArrayList.add(new user("asasd", "hey"));
        userArrayList.add(new user("zxczxc", "bye"));
        userArrayList.add(new user("asdasd", "ok"));
        userArrayList.add(new user("sambhav", "cool"));
        userArrayList.add(new user("snbvnv", "see yaa"));
        userArrayList.add(new user("ghmghmg", "bruh"));
        userArrayList.add(new user("jasdasd", "Nope"));
        userArrayList.add(new user("sambhav", "hi"));
        userArrayList.add(new user("asasd", "hey"));
        userArrayList.add(new user("zxczxc", "bye"));
        userArrayList.add(new user("asdasd", "ok"));
        userArrayList.add(new user("sambhav", "cool"));
        userArrayList.add(new user("snbvnv", "see yaa"));
        userArrayList.add(new user("ghmghmg", "bruh"));
        userArrayList.add(new user("jasdasd", "Nope"));
        userArrayList.add(new user("sambhav", "hi"));
        userArrayList.add(new user("asasd", "hey"));
        userArrayList.add(new user("zxczxc", "bye"));
        userArrayList.add(new user("asdasd", "ok"));
        userArrayList.add(new user("sambhav", "cool"));
        userArrayList.add(new user("snbvnv", "see yaa"));
        userArrayList.add(new user("ghmghmg", "bruh"));
        userArrayList.add(new user("jasdasd", "Nope"));

        RecyclerView recyclerView =(RecyclerView)view.findViewById(R.id.rView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        MyUserAdapter myUserAdapter = new MyUserAdapter(userArrayList,this);
        recyclerView.setAdapter(myUserAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        return  view;

        return inflater.inflate(R.layout.chat,container,false);

    }
}
