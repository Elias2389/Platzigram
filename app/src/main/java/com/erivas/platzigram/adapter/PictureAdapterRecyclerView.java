package com.erivas.platzigram.adapter;


import android.app.Activity;
import com.erivas.platzigram.model.Picture;

import android.content.Intent;
import android.os.Build;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.widget.RecyclerView;
import android.transition.Explode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.erivas.platzigram.R;
import com.erivas.platzigram.view.PictureDetailActivity;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class PictureAdapterRecyclerView extends RecyclerView.Adapter<PictureAdapterRecyclerView.PictureViewHolder>{

    private ArrayList<Picture> pictures;
    private int resource;
    private Activity activity;

    public PictureAdapterRecyclerView(ArrayList<Picture> pictures, int resource, Activity activity) {
        this.pictures = pictures;
        this.resource = resource;
        this.activity = activity;
    }

    @Override
    public PictureViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(resource,parent,false);
        return new PictureViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PictureViewHolder holder, int position) {
        Picture picture = pictures.get(position);
        holder.usernameCard.setText(picture.getUserName());
        holder.timeCard.setText(picture.getTime());
        holder.likeNumbercard.setText(picture.getLike());
        Picasso.with(activity).load(picture.getPicture()).into(holder.imageCard);

        holder.imageCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity, PictureDetailActivity.class);
//                activity.startActivity(intent);

                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
                    Explode explode = new Explode();
                    explode.setDuration(1000);
                    activity.getWindow().setExitTransition(explode);

                    activity.startActivity(intent,
                            ActivityOptionsCompat.makeSceneTransitionAnimation(
                                    activity,view,activity.getString(R.string.transition_name_picture))
                                    .toBundle());

                }else{
                    activity.startActivity(intent);
                }


            }
        });
    }

    @Override
    public int getItemCount() {
        return pictures.size();
    }

    public class PictureViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageCard;
        private TextView usernameCard;
        private TextView timeCard;
        private TextView likeNumbercard;

        public PictureViewHolder(View itemView) {
            super(itemView);
            imageCard = (ImageView) itemView.findViewById(R.id.imageCard);
            usernameCard = (TextView) itemView.findViewById(R.id.usernameCard);
            timeCard = (TextView) itemView.findViewById(R.id.timeCard);
            likeNumbercard = (TextView) itemView.findViewById(R.id.likeNumberCard);
        }

    }

}
