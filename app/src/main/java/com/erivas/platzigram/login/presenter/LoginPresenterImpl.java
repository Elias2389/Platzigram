package com.erivas.platzigram.login.presenter;

import com.erivas.platzigram.login.interactor.LoginInteractor;
import com.erivas.platzigram.login.interactor.LoginInteractorImpl;
import com.erivas.platzigram.login.view.LoginView;

/**
 * Created by erivas on 11/20/17.
 */

public class LoginPresenterImpl implements LoginPresenter {

    LoginView loginView;
    LoginInteractor interactor;

    public LoginPresenterImpl(LoginView loginView) {
        this.loginView = loginView;
        interactor = new LoginInteractorImpl(this);
    }

    @Override
    public void signIn(String username, String password) {

    }

    @Override
    public void loginSuccess() {

    }

    @Override
    public void loginError() {

    }
}
