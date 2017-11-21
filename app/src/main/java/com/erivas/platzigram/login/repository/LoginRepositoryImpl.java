package com.erivas.platzigram.login.repository;

import com.erivas.platzigram.login.presenter.LoginPresenter;

/**
 * Created by erivas on 11/21/17.
 */

public class LoginRepositoryImpl implements LoginRepository {

    LoginPresenter presenter;

    public LoginRepositoryImpl(LoginPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void signIn(String username, String password) {

        boolean success = true;

        if(success){
            presenter.loginSuccess();

        }else{
            presenter.loginError("ocurrio un error");
        }

    }
}
