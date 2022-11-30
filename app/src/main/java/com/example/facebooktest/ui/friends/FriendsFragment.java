package com.example.facebooktest.ui.friends;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.facebooktest.R;
import com.example.facebooktest.databinding.FragmentFriendsBinding;
import com.example.facebooktest.model.FriendsRequestModel;

import java.util.ArrayList;


public class FriendsFragment extends Fragment {
    FragmentFriendsBinding binding;
    FriendRequestRecyclerAdapter adapter;
    ArrayList <FriendsRequestModel> requestData = new ArrayList<>();

    public FriendsFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_friends, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding=FragmentFriendsBinding.bind(view);
        setUp();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding=null;
    }
    private void setUp (){
        addFakeData();
        adapter = new FriendRequestRecyclerAdapter(requestData);
        binding.friendRequestsRecyclerView.setAdapter(adapter);
        binding.friendRequestsRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

    }
    private void addFakeData (){
        requestData.add(new FriendsRequestModel("Sara Eid","2w","2 mutual friend",R.drawable.post_img));
        requestData.add(new FriendsRequestModel("Sara Eid","2w","2 mutual friend",R.drawable.post_img));
        requestData.add(new FriendsRequestModel("Sara Eid","2w","2 mutual friend",R.drawable.post_img));
        requestData.add(new FriendsRequestModel("Sara Eid","2w","2 mutual friend",R.drawable.post_img));
        requestData.add(new FriendsRequestModel("Sara Eid","2w","2 mutual friend",R.drawable.post_img));
        requestData.add(new FriendsRequestModel("Sara Eid","2w","2 mutual friend",R.drawable.post_img));
        requestData.add(new FriendsRequestModel("Sara Eid","2w","2 mutual friend",R.drawable.post_img));
        requestData.add(new FriendsRequestModel("Sara Eid","2w","2 mutual friend",R.drawable.post_img));
        requestData.add(new FriendsRequestModel("Sara Eid","2w","2 mutual friend",R.drawable.post_img));
        requestData.add(new FriendsRequestModel("Sara Eid","2w","2 mutual friend",R.drawable.post_img));
        requestData.add(new FriendsRequestModel("Sara Eid","2w","2 mutual friend",R.drawable.post_img));
        requestData.add(new FriendsRequestModel("Sara Eid","2w","2 mutual friend",R.drawable.post_img));
        requestData.add(new FriendsRequestModel("Sara Eid","2w","2 mutual friend",R.drawable.post_img));
        requestData.add(new FriendsRequestModel("Sara Eid","2w","2 mutual friend",R.drawable.post_img));
        requestData.add(new FriendsRequestModel("Sara Eid","2w","2 mutual friend",R.drawable.post_img));


    }
}