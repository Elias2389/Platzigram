package com.erivas.platzigram.login.presenter;

import android.app.Activity;

import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by erivas on 11/20/17.
 */

public interface LoginPresenter {

    void signIn(String username, String password, Activity activity, FirebaseAuth firebaseAuth);
    void loginSuccess();
    void loginError(String error);


}
