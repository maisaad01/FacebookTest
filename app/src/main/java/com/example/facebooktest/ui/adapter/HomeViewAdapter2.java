package com.example.facebooktest.ui.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.facebooktest.ui.fragment.Feeds;
import com.example.facebooktest.ui.fragment.Home;
import com.example.facebooktest.ui.fragment.Marketplace;
import com.example.facebooktest.ui.fragment.Menu;
import com.example.facebooktest.ui.fragment.Notifications;
import com.example.facebooktest.ui.fragment.Video;

public class HomeViewAdapter2 extends FragmentStateAdapter {
    private int count ;
    public HomeViewAdapter2(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle, int count) {
        super(fragmentManager, lifecycle);
        this.count =count;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0 :
                return new Home();
            case 1 :
                return  new Video();
            case 2 :
                return new Marketplace();
            case 3 :
                return new Feeds();
            case 4 :
                return new Notifications();
            case 5 :
                return new Menu();
        }
        return new Fragment();
    }

    @Override
    public int getItemCount() {
        return count;
    }
}
