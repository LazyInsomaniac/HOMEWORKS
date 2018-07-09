package com.abc.portfolio;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        {
            ImageButton dial = findViewById(R.id.dial);
            dial.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent();
                    i.setAction(Intent.ACTION_DIAL);            // for call
                    i.setData(Uri.parse("tel:// 9899456453")); // To call
                    startActivity(i);


                }


            });

        }
        {
            ImageButton fb = findViewById(R.id.fb);
            fb.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent();
                    i.setAction(Intent.ACTION_VIEW);                                   // for Link
                    i.setData(Uri.parse("https://www.facebook.com/sambhav.sharma3")); // to Fb
                    startActivity(i);
                }
            });

        }

        {
            ImageButton insta = findViewById(R.id.insta);
            insta.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent();
                    i.setAction(Intent.ACTION_VIEW);                                     // for Link
                    i.setData(Uri.parse("https://www.instagram.com/thesambhavsharma/")); // to insta
                    startActivity(i);
                }
            });

        }
        }
    }
