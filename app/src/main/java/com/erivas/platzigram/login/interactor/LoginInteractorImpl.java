package com.erivas.platzigram.login.interactor;

import android.app.Activity;

import com.erivas.platzigram.login.presenter.LoginPresenter;
import com.erivas.platzigram.login.repository.LoginRepository;
import com.erivas.platzigram.login.repository.LoginRepositoryImpl;
import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by erivas on 11/20/17.
 */

public class LoginInteractorImpl implements LoginInteractor {

    private LoginPresenter presenter;
    private LoginRepository repository;

    public LoginInteractorImpl(LoginPresenter presenter) {
        this.presenter = presenter;
        repository = new LoginRepositoryImpl(presenter);
    }

    @Override
    public void signIn(String username, String password, Activity activity, FirebaseAuth firebaseAuth) {
        repository.signIn(username,password, activity, firebaseAuth);
    }
}
