package com.erivas.platzigram.post.view;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.erivas.platzigram.R;
import com.squareup.picasso.Picasso;

public class NewPostActivity extends AppCompatActivity {

    private ImageView imgPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_post);

        imgPhoto = (ImageView) findViewById(R.id.img_photo);

        if(getIntent().getExtras() != null){
            String photoPath = getIntent().getExtras().getString("PHOTP_PATH_TEMP");
            Picasso.with(this).load(photoPath).into(imgPhoto);
        }


    }

}
