package com.abc.instaui;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<feed> feedArrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        feedArrayList.add(new feed("Sambhav","New Delhi","https://specials-images.forbesimg.com/imageserve/5b1480ae4bbe6f74868b74b5/416x416.jpg?background=000000&cropX1=451&cropX2=2982&cropY1=143&cropY2=2675"));
        feedArrayList.add(new feed("Sambhav","New Delhi","https://specials-images.forbesimg.com/imageserve/5b1480ae4bbe6f74868b74b5/416x416.jpg?background=000000&cropX1=451&cropX2=2982&cropY1=143&cropY2=2675"));
        feedArrayList.add(new feed("Sambhav","New Delhi","https://specials-images.forbesimg.com/imageserve/5b1480ae4bbe6f74868b74b5/416x416.jpg?background=000000&cropX1=451&cropX2=2982&cropY1=143&cropY2=2675"));
        feedArrayList.add(new feed("Sambhav","New Delhi","https://specials-images.forbesimg.com/imageserve/5b1480ae4bbe6f74868b74b5/416x416.jpg?background=000000&cropX1=451&cropX2=2982&cropY1=143&cropY2=2675"));
        feedArrayList.add(new feed("Sambhav","New Delhi","https://specials-images.forbesimg.com/imageserve/5b1480ae4bbe6f74868b74b5/416x416.jpg?background=000000&cropX1=451&cropX2=2982&cropY1=143&cropY2=2675"));
        feedArrayList.add(new feed("Sambhav","New Delhi","https://specials-images.forbesimg.com/imageserve/5b1480ae4bbe6f74868b74b5/416x416.jpg?background=000000&cropX1=451&cropX2=2982&cropY1=143&cropY2=2675"));
        feedArrayList.add(new feed("Sambhav","New Delhi","https://specials-images.forbesimg.com/imageserve/5b1480ae4bbe6f74868b74b5/416x416.jpg?background=000000&cropX1=451&cropX2=2982&cropY1=143&cropY2=2675"));
        feedArrayList.add(new feed("Sambhav","New Delhi","https://specials-images.forbesimg.com/imageserve/5b1480ae4bbe6f74868b74b5/416x416.jpg?background=000000&cropX1=451&cropX2=2982&cropY1=143&cropY2=2675"));
        feedArrayList.add(new feed("Sambhav","New Delhi","https://specials-images.forbesimg.com/imageserve/5b1480ae4bbe6f74868b74b5/416x416.jpg?background=000000&cropX1=451&cropX2=2982&cropY1=143&cropY2=2675"));
        feedArrayList.add(new feed("Sambhav","New Delhi","https://specials-images.forbesimg.com/imageserve/5b1480ae4bbe6f74868b74b5/416x416.jpg?background=000000&cropX1=451&cropX2=2982&cropY1=143&cropY2=2675"));
        feedArrayList.add(new feed("Sambhav","New Delhi","https://specials-images.forbesimg.com/imageserve/5b1480ae4bbe6f74868b74b5/416x416.jpg?background=000000&cropX1=451&cropX2=2982&cropY1=143&cropY2=2675"));
        feedArrayList.add(new feed("Sambhav","New Delhi","https://specials-images.forbesimg.com/imageserve/5b1480ae4bbe6f74868b74b5/416x416.jpg?background=000000&cropX1=451&cropX2=2982&cropY1=143&cropY2=2675"));
        feedArrayList.add(new feed("Sambhav","New Delhi","https://specials-images.forbesimg.com/imageserve/5b1480ae4bbe6f74868b74b5/416x416.jpg?background=000000&cropX1=451&cropX2=2982&cropY1=143&cropY2=2675"));
        feedArrayList.add(new feed("Sambhav","New Delhi","https://specials-images.forbesimg.com/imageserve/5b1480ae4bbe6f74868b74b5/416x416.jpg?background=000000&cropX1=451&cropX2=2982&cropY1=143&cropY2=2675"));
        feedArrayList.add(new feed("Sambhav","New Delhi","https://specials-images.forbesimg.com/imageserve/5b1480ae4bbe6f74868b74b5/416x416.jpg?background=000000&cropX1=451&cropX2=2982&cropY1=143&cropY2=2675"));
        feedArrayList.add(new feed("Sambhav","New Delhi","https://specials-images.forbesimg.com/imageserve/5b1480ae4bbe6f74868b74b5/416x416.jpg?background=000000&cropX1=451&cropX2=2982&cropY1=143&cropY2=2675"));
        feedArrayList.add(new feed("Sambhav","New Delhi","https://specials-images.forbesimg.com/imageserve/5b1480ae4bbe6f74868b74b5/416x416.jpg?background=000000&cropX1=451&cropX2=2982&cropY1=143&cropY2=2675"));
        feedArrayList.add(new feed("Sambhav","New Delhi","https://specials-images.forbesimg.com/imageserve/5b1480ae4bbe6f74868b74b5/416x416.jpg?background=000000&cropX1=451&cropX2=2982&cropY1=143&cropY2=2675"));
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        MyfeedAdapter myfeedAdapter = new MyfeedAdapter(feedArrayList,this);
        recyclerView.setAdapter(myfeedAdapter);
    }
}
