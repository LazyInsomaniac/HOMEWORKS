package com.ms.listviewcustomadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Student> studentArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        studentArrayList.add(new Student("Muskan", "Android", "9896345755", "Delhi"));
        studentArrayList.add(new Student("Ritik", "Android", "9875985754", "Rohtak"));
        studentArrayList.add(new Student("Smyra", "Android", "98365412987", "Dwarka"));
        studentArrayList.add(new Student("Ravneet", "Android", "9875745745", "Delhi"));
        studentArrayList.add(new Student("Gurjeet", "Android", "9360045755", "Delhi"));
        studentArrayList.add(new Student("Pavneet", "Android", "9875745755", "Rohtak"));
        studentArrayList.add(new Student("Sambhav", "Android", "8855236974", "Dwarka"));
        studentArrayList.add(new Student("Deepesh", "Android", "9775745755", "Delhi"));
        studentArrayList.add(new Student("Harsh", "Android", "9802585755", "Delhi"));
        studentArrayList.add(new Student("Rajat", "Android", "9875746355", "Rohtak"));
        studentArrayList.add(new Student("Anoop", "Android", "9999745755", "Dwarka"));
        studentArrayList.add(new Student("Prachi", "Android", "9002502755", "Delhi"));
        studentArrayList.add(new Student("Prarthana", "Android", "7011589632", "Delhi"));
        studentArrayList.add(new Student("Amayra", "Android", "9778820365", "Rohtak"));
        studentArrayList.add(new Student("Avya", "Android", "8855236541", "Dwarka"));
        ListView studentList = findViewById(R.id.listView);
        studentList.setAdapter(new MyCustomAdapter());
    }

    class MyCustomAdapter extends BaseAdapter {


        @Override
        public int getCount() {
            return studentArrayList.size();
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
        public View getView(int i, View view, ViewGroup viewGroup) {
            LayoutInflater li = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
            View rowView = new ViewHolder(rowView);
            final Student currentStudent = studentArrayList.get(i);

            TextView studentName = rowView.findViewById(R.id.studentName);
            TextView studentBatch = rowView.findViewById(R.id.studentBatch);
            TextView studentNumber = rowView.findViewById(R.id.studentNumber);
            TextView studentLocation = rowView.findViewById(R.id.studentLocation);
            studentName.setText(currentStudent.getName());
            studentBatch.setText(currentStudent.getBatch());
            studentNumber.setText(currentStudent.getNumber());
            studentLocation.setText(currentStudent.getLocation());


            Button btn = rowView.findViewById(R.id.idBtn);
            // btn.setOnClickListener(new View.OnClickListener() 
            return rowView;
        }
    }
}
   