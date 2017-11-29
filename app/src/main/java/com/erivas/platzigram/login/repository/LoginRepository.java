package com.erivas.platzigram.login.repository;

import android.app.Activity;

import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by erivas on 11/21/17.
 */

public interface LoginRepository {
    void signIn(String username, String password, Activity activity,FirebaseAuth firebaseAuth);

}
