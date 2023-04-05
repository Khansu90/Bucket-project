package com.example.khansusbucketlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class bucketListAdapter extends RecyclerView.Adapter<bucketListAdapter.bucketViewHolder> {

   Activities activity [];

    public bucketListAdapter(Activities[] activity) {
        this.activity = activity;
    }

    @Override
    public int getItemCount() {
        return activity.length;


}@NonNull
    @Override
    public bucketViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.project_icon,parent,false);
        return new bucketViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull bucketViewHolder holder, int position) {
        holder.bind (activity [position]);

    }




    static class bucketViewHolder extends RecyclerView.ViewHolder{

        ImageView appImage;
        TextView appTitle;
        TextView appDescription;
        RatingBar appRating;


        public bucketViewHolder(@NonNull View itemView) {
            super(itemView);
            appImage = itemView.findViewById(R.id.image_view_project_icon);
            appTitle = itemView.findViewById(R.id.text_view_title);
            appDescription = itemView.findViewById(R.id.text_view_description);
            appRating = itemView.findViewById(R.id.rate_view_rating);
        }
        public void bind (Activities activities) {
            appImage.setImageResource(activities.image);
            appTitle.setText(activities.title);
            appDescription.setText(activities.description);
            appRating.setRating(activities.rating);

        }
    }
}
