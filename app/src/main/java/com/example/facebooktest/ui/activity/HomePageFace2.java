package com.example.facebooktest.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.facebooktest.R;
import com.example.facebooktest.ui.adapter.HomeViewAdapter2;
import com.google.android.material.tabs.TabLayout;

public class HomePageFace2 extends AppCompatActivity {
     private ViewPager2 homeViewPager ;
     private TabLayout homeTabLayout ;
     public HomeViewAdapter2 homeAdapter;
     private Object HomeViewAdapter2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page_face2);
        initUi();
    }

    private void initUi() {
        homeAdapter =new HomeViewAdapter2(getSupportFragmentManager(),this.getLifecycle(),6);
        homeViewPager = findViewById(R.id.viewPager_facebook2);
        homeTabLayout = findViewById(R.id.tabLayout_facebook2);
        homeViewPager.setAdapter(homeAdapter);
        homeTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener(){

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                homeViewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }
}