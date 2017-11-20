package com.erivas.platzigram.login.presenter;

/**
 * Created by erivas on 11/20/17.
 */

public interface LoginPresenter {

    void signIn(String username, String password);
    void loginSuccess();
    void loginError();


}
