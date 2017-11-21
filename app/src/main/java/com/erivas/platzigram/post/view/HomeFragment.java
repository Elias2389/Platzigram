package com.erivas.platzigram.post.view;


import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.erivas.platzigram.R;
import com.erivas.platzigram.adapter.PictureAdapterRecyclerView;
import com.erivas.platzigram.model.Picture;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private static final int REQUEST_CAMERA = 1;
    private FloatingActionButton fabCamera;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        showToolbar("Home",false, view);
        RecyclerView picturesRecycler = (RecyclerView) view.findViewById(R.id.pictureRecycler);

        fabCamera = (FloatingActionButton) view.findViewById(R.id.fabCamera);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        picturesRecycler.setLayoutManager(linearLayoutManager);

        PictureAdapterRecyclerView pictureAdapterRecyclerView = new PictureAdapterRecyclerView(buildPictures(),R.layout.cardview_picture,getActivity());
        picturesRecycler.setAdapter(pictureAdapterRecyclerView);


        fabCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                takePicture();
            }
        });


        return view;
    }



    private void takePicture() {

        Intent intenttakePicture = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if(intenttakePicture.resolveActivity(getActivity().getPackageManager()) != null){
            startActivityForResult(intenttakePicture, REQUEST_CAMERA);
        }
    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {

        if(requestCode == REQUEST_CAMERA && resultCode == getActivity().RESULT_OK){
            Log.d("Home fragment","Camera Ok");
        }

    }


    public ArrayList<Picture> buildPictures(){
        ArrayList<Picture> pictures = new ArrayList<>();

        pictures.add(new Picture("http://www.novalandtours.com/images/guide/guilin.jpg","User One","3 dias","1 me gusta"));
        pictures.add(new Picture("http://www.novalandtours.com/images/guide/guilin.jpg","User Two","8 dias","20 me gusta"));
        pictures.add(new Picture("http://www.novalandtours.com/images/guide/guilin.jpg","User Three","1 dias","6 me gusta"));
        pictures.add(new Picture("http://www.novalandtours.com/images/guide/guilin.jpg","User Four","5 dias","9 me gusta"));
        pictures.add(new Picture("http://www.novalandtours.com/images/guide/guilin.jpg","User Five","7 dias","12 me gusta"));

        return pictures;
    }

        public void showToolbar(String title, boolean upButton, View view){
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(title);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }


}
