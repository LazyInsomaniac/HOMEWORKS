package com.abc.whtspui2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<user> userArrayList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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


        ListView userList = findViewById(R.id.listView);
        userList.setAdapter(new MyCustomAdapter());
    }

    class MyCustomAdapter extends BaseAdapter {


        @Override
        public int getCount() {

            return userArrayList.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) //View view is responsible for finding offscreen view
        {

            LayoutInflater li = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
            View rowView;
            if (view == null)                                                     // memory management

            {
                rowView = li.inflate(R.layout.data, viewGroup, false);
                viewHolder viewHolder = new viewHolder();
                viewHolder.name = rowView.findViewById(R.id.text1);
                viewHolder.message = rowView.findViewById(R.id.text2);

               rowView.setTag(viewHolder);
            } else {
                rowView = view;

            }
            user currentuser = userArrayList.get(i);
            viewHolder vh = (viewHolder) rowView.getTag();
            ImageUrl currentImage = (ImageUrl)currentuser.getUserArrayList(i);
            vh.name.setText(currentuser.getName());


              TextView studentName = rowView.findViewById(R.id.text1);
              TextView studentMesaage = rowView.findViewById(R.id.text2);
             studentName.setText(currentuser.getName());
            studentMesaage.setText(currentuser.getMessage());
            return rowView;

        }

        class viewHolder {
            TextView name, message;
            ImageView img;


        }
    }
}

