package com.abc.loop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView = findViewById(R.id.tv);
        final ProgressBar progressBar = findViewById(R.id.progressBar);
        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (long i = 0; i < 1000000; i++)
                {
                    if (i % 100 == 0)
                        textView.setText("Current Count :" + i);
                }
                textView.setText("Counting Done!");
                progressBar.setVisibility(View.GONE);
            }
        });
    }
}
