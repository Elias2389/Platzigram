package com.erivas.platzigram;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.erivas.platzigram.view.ContainerActivity;
import com.erivas.platzigram.view.CreateAccountActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void goCreateAccount(View view){
        Intent intent = new Intent(this, CreateAccountActivity.class);
        startActivity(intent);
    }

    public void goToContainerActivity(View view){
        Intent intent = new Intent(this, ContainerActivity.class);
        startActivity(intent);
    }

    public void goToWebPage(View view){
        String url = "http://www.platzigram.com";
        Uri web = Uri.parse(url);

        Intent intent = new Intent(Intent.ACTION_VIEW, web);
        startActivity(intent);

    }






}
