package com.example.facebooktest.ui.friends;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.facebooktest.R;
import com.example.facebooktest.databinding.ItemFriendsRequestLayoutBinding;
import com.example.facebooktest.model.FriendsRequestModel;

import java.util.List;

public class FriendRequestRecyclerAdapter extends RecyclerView.Adapter<FriendRequestRecyclerAdapter.friendRequestHolder> {
    private List <FriendsRequestModel> friendsRequestModels;

    public FriendRequestRecyclerAdapter(List<FriendsRequestModel> friendsRequestModels) {
        this.friendsRequestModels = friendsRequestModels;
    }

    @NonNull
    @Override
    public friendRequestHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemFriendsRequestLayoutBinding binding = ItemFriendsRequestLayoutBinding.bind(LayoutInflater
                .from(parent.getContext()).inflate(R.layout.item_friends_request_layout,parent,false));
        return new friendRequestHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull friendRequestHolder holder, int position) {
        FriendsRequestModel requestModel = friendsRequestModels.get(position);
        holder.binding.requestProfileName.setText(requestModel.getRequestName());
        holder.binding.requestProfileImg.setImageResource(requestModel.getRequestImg());
        holder.binding.mutualFriend.setText(requestModel.getRequestMutual());
        holder.binding.timeRequest.setText(requestModel.getRequestTime());

    }

    @Override
    public int getItemCount() {
        if (friendsRequestModels != null)
            return friendsRequestModels.size();
        return 0;
    }

    static class friendRequestHolder extends RecyclerView.ViewHolder{
        ItemFriendsRequestLayoutBinding binding;

        public friendRequestHolder(@NonNull ItemFriendsRequestLayoutBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}
