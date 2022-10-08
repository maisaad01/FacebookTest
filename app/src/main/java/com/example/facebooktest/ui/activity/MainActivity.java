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

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}