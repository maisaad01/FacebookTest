package com.example.facebooktest.ui.home;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.facebooktest.ui.fragment.MemoriesFragment;
import com.example.facebooktest.ui.fragment.MarketplaceFragment;
import com.example.facebooktest.ui.fragment.MenuFragment;
import com.example.facebooktest.ui.fragment.NotificationsFragment;
import com.example.facebooktest.ui.friends.FriendsFragment;

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
                return new HomeFragment();
            case 1 :
                return  new FriendsFragment();
            case 2 :
                return new MarketplaceFragment();
            case 3 :
                return new MemoriesFragment();
            case 4 :
                return new NotificationsFragment();
            case 5 :
                return new MenuFragment();
        }
        return new Fragment();
    }

    @Override
    public int getItemCount() {
        return count;
    }
}
