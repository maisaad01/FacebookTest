package com.example.facebooktest.ui.home;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class HomeViewAdapter extends FragmentStatePagerAdapter {

    ArrayList <Fragment> fragmentList = new ArrayList<>();
    ArrayList <String> titleList = new ArrayList<>();
    public HomeViewAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titleList.get(position);
    }


    public void addFragment (Fragment fragment , String title){
        fragmentList.add(fragment);
        titleList.add(title);
    }
}
