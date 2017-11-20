package com.erivas.platzigram.login.view;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.erivas.platzigram.R;
import com.erivas.platzigram.view.ContainerActivity;
import com.erivas.platzigram.view.CreateAccountActivity;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity implements LoginView{

    private TextInputEditText username, password;
    private Button login;
    private ProgressBar progressBarLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (TextInputEditText) findViewById(R.id.username);
        password = (TextInputEditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);
        progressBarLogin = (ProgressBar) findViewById(R.id.progressBar_login);


    }

    @Override
    public void enabledInputs() {
        username.setEnabled(true);
        password.setEnabled(true);
        login.setEnabled(true);
    }

    @Override
    public void disabledInputs() {
        username.setEnabled(false);
        password.setEnabled(false);
        login.setEnabled(false);
    }

    @Override
    public void showProgressbar() {
        progressBarLogin.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideprogressBar() {
        progressBarLogin.setVisibility(View.GONE);
    }

    @Override
    public void loginError() {

    }

    @Override
    public void goCreateAccount() {
        Intent intent = new Intent(this, CreateAccountActivity.class);
        startActivity(intent);
    }

    @Override
    public void goHome() {
        Intent intent = new Intent(this, ContainerActivity.class);
        startActivity(intent);
    }

    @Override
    public void goToWebPage() {
        String url = "http://www.platzigram.com";
        Uri web = Uri.parse(url);

        Intent intent = new Intent(Intent.ACTION_VIEW, web);
        startActivity(intent);
    }
}
