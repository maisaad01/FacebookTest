package com.example.facebooktest.ui.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.facebooktest.R;
import com.example.facebooktest.model.PostModel;
import com.example.facebooktest.ui.adapter.HomeRecyclerAdapter;

import java.util.ArrayList;

public class Home extends Fragment {
    RecyclerView postRecycler ;
    HomeRecyclerAdapter postAdapter ;
    ArrayList <PostModel> postData = new ArrayList<>();

    public Home() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        postRecycler = view.findViewById(R.id.Home_Facebook_Recycler);
        setUp();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
     private void setUp (){
        addFakeData ();
        postAdapter = new HomeRecyclerAdapter(postData);
        postRecycler.setAdapter(postAdapter);
        postRecycler.setLayoutManager(new LinearLayoutManager(
                getContext()));
     }

    private void addFakeData() {
        postData.add(new PostModel("Mai Saad","Hello","2h",R.drawable.post_img,R.drawable.post_img));
        postData.add(new PostModel("Mai Saad","Hello","2h",R.drawable.post_img,R.drawable.post_img));
        postData.add(new PostModel("Mai Saad","Hello","2h",R.drawable.post_img,R.drawable.post_img));
        postData.add(new PostModel("Mai Saad","Hello","2h",R.drawable.post_img,R.drawable.post_img));
        postData.add(new PostModel("Mai Saad","Hello","2h",R.drawable.post_img,R.drawable.post_img));
        postData.add(new PostModel("Mai Saad","Hello","2h",R.drawable.post_img,R.drawable.post_img));
        postData.add(new PostModel("Mai Saad","Hello","2h",R.drawable.post_img,R.drawable.post_img));

    }
}