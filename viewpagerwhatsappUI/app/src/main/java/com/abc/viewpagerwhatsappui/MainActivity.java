package com.abc.viewpagerwhatsappui;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(new MyViewPagerAdapter(getSupportFragmentManager()));
        TabLayout tabLayout = findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
    }
     class MyViewPagerAdapter extends FragmentPagerAdapter{

         public MyViewPagerAdapter(FragmentManager fm) {super(fm);}

         @Override
         public CharSequence getPageTitle(int position)
         { switch (position)
             {
             case 0:
                 return "Camera";
             case 1:
                 return "Chats";
             case 2:
                 return "Status";
             case 3:
                 return "Calls";
             default:
                 return null;
             }
         }
         @Override
         public Fragment getItem(int i) {
             switch (i)
             {
                 case 0 :
                     return new FragmentCamera();
                 case 1 :
                     return new FragmentChat();
                 case 2 :
                     return new FragmentStatus();
                 case 3:
                     return new FragmentCall();
                 default:
                     return null;
             }

         }

         @Override
         public int getCount() {
             return 4;
         }
     }
}
