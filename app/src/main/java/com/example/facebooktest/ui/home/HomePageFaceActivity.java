package com.example.facebooktest.ui.home;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.facebooktest.R;
import com.example.facebooktest.ui.fragment.MemoriesFragment;
import com.example.facebooktest.ui.fragment.MarketplaceFragment;
import com.example.facebooktest.ui.fragment.MenuFragment;
import com.example.facebooktest.ui.fragment.NotificationsFragment;
import com.example.facebooktest.ui.friends.FriendsFragment;
import com.google.android.material.tabs.TabLayout;

public class HomePageFaceActivity extends AppCompatActivity {
    TabLayout tabLayoutF ;
    ViewPager viewPagerF ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page_face);
        setUi();
        tabLayoutF.setupWithViewPager(viewPagerF);
        HomeViewAdapter homeViewAdapter = new HomeViewAdapter(getSupportFragmentManager());
        homeViewAdapter.addFragment(new HomeFragment(),"");
        homeViewAdapter.addFragment(new FriendsFragment(),"");
        homeViewAdapter.addFragment(new MarketplaceFragment(),"");
        homeViewAdapter.addFragment(new MemoriesFragment(),"");
        homeViewAdapter.addFragment(new NotificationsFragment(),"");
        homeViewAdapter.addFragment(new MenuFragment(),"");
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.optionmenue,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()== R.id.search)
            Toast.makeText(this,"Search",Toast.LENGTH_LONG).show();
        if  (item.getItemId()== R.id.messenger)
            Toast.makeText(this,"Messenger",Toast.LENGTH_LONG).show();
        if (item.getItemId()== R.id.add)
            Toast.makeText(this,"Add",Toast.LENGTH_LONG).show();
        return super.onOptionsItemSelected(item);
    }
}