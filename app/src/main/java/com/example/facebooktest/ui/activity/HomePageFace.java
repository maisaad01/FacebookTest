package com.example.facebooktest.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.facebooktest.R;
import com.example.facebooktest.ui.adapter.HomeViewAdapter;
import com.example.facebooktest.ui.fragment.Feeds;
import com.example.facebooktest.ui.fragment.Home;
import com.example.facebooktest.ui.fragment.Marketplace;
import com.example.facebooktest.ui.fragment.Menu;
import com.example.facebooktest.ui.fragment.Notifications;
import com.example.facebooktest.ui.fragment.Video;
import com.google.android.material.tabs.TabLayout;

public class HomePageFace extends AppCompatActivity {
    TabLayout tabLayoutF ;
    ViewPager viewPagerF ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page_face);
        setUi();
        tabLayoutF.setupWithViewPager(viewPagerF);
        HomeViewAdapter homeViewAdapter = new HomeViewAdapter(getSupportFragmentManager());
        homeViewAdapter.addFragment(new Home(),"");
        homeViewAdapter.addFragment(new Video(),"");
        homeViewAdapter.addFragment(new Marketplace(),"");
        homeViewAdapter.addFragment(new Feeds(),"");
        homeViewAdapter.addFragment(new Notifications(),"");
        homeViewAdapter.addFragment(new Menu(),"");
        tabLayoutF.getTabAt(0).setIcon(R.drawable.ic_baseline_home_24);
        tabLayoutF.getTabAt(1).setIcon(R.drawable.ic_baseline_video_24);
        tabLayoutF.getTabAt(2).setIcon(R.drawable.ic_baseline_shopping_cart_24);
        tabLayoutF.getTabAt(3).setIcon(R.drawable.ic_baseline_feedback_24);
        tabLayoutF.getTabAt(4).setIcon(R.drawable.ic_baseline_notifications_24);
        tabLayoutF.getTabAt(5).setIcon(R.drawable.ic_baseline_menu_24);
        viewPagerF.setAdapter(homeViewAdapter);
    }
    private void setUi() {
        tabLayoutF = findViewById(R.id.tabLayout_facebook);
        viewPagerF = findViewById(R.id.viewPager_facebook);
    }
}