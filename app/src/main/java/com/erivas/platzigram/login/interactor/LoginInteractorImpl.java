package com.erivas.platzigram.login.interactor;

import com.erivas.platzigram.login.presenter.LoginPresenter;

/**
 * Created by erivas on 11/20/17.
 */

public class LoginInteractorImpl implements LoginInteractor {

    private LoginPresenter presenter;

    public LoginInteractorImpl(LoginPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void signIn(String username, String password) {

    }
}
