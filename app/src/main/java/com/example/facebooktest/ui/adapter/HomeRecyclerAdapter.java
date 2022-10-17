package com.example.facebooktest.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.facebooktest.R;
import com.example.facebooktest.model.PostModel;

import java.util.List;

public class HomeRecyclerAdapter extends RecyclerView.Adapter<HomeRecyclerAdapter.postHolder>{
    private List <PostModel> posts ;

    public HomeRecyclerAdapter(List<PostModel> posts) {
        this.posts = posts;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public postHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_posts_layout,parent,false);
        return new postHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull postHolder holder, int position) {
        PostModel postModel = posts.get(position);
        holder.userNameProPost.setText(postModel.getUserNamePost());
        holder.userProImgPost.setImageResource(postModel.getProfileImg());
        holder.postText.setText(postModel.getPostText());
        holder.postTime.setText(postModel.getPostTime());
        holder.postImg.setImageResource(postModel.getPostImg() );
    }

    @Override
    public int getItemCount() {
        if (posts != null){
            return posts.size();
        }
        return 0;
    }

    static class postHolder extends RecyclerView.ViewHolder{
        TextView userNameProPost , postTime , postText ;
        ImageView userProImgPost , postImg ;

        public postHolder(@NonNull View itemView) {
            super(itemView);
            userNameProPost = itemView.findViewById(R.id.profile_name);
            postTime = itemView.findViewById(R.id.post_time);
            postText = itemView.findViewById(R.id.Text_Post);
            postImg = itemView.findViewById(R.id.post_img);
            userProImgPost = itemView.findViewById(R.id.profile_img);


        }
    }
}
