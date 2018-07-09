package com.abc.whatsapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         tabLayout =(TabLayout)findViewById(R.id.tabLayout);
         viewPager =(ViewPager)findViewById(R.id.viewPager);
         adapter  = new ViewPagerAdapter(getSupportFragmentManager());
         //ADDING FRAGMENT
        adapter.ADDFragment(new FragmentCamera(),"");
        adapter.ADDFragment(new FragmentChat(),"Chat");
        adapter.ADDFragment(new FragmentStatus(),"Status");
        adapter.ADDFragment(new FragmentCall(),"Call");

         viewPager.setAdapter(adapter);
         tabLayout.setupWithViewPager(viewPager);
         tabLayout.getTabAt(0).setIcon(R.drawable.ic_cam);



    }
}
