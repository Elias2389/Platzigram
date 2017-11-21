package com.erivas.platzigram.login.presenter;

import com.erivas.platzigram.login.interactor.LoginInteractor;
import com.erivas.platzigram.login.interactor.LoginInteractorImpl;
import com.erivas.platzigram.login.view.LoginView;



public class LoginPresenterImpl implements LoginPresenter {

    LoginView loginView;
    LoginInteractor interactor;

    public LoginPresenterImpl(LoginView loginView) {
        this.loginView = loginView;
        interactor = new LoginInteractorImpl(this);
    }

    @Override
    public void signIn(String username, String password) {

        loginView.disabledInputs();
        loginView.showProgressbar();
        interactor.signIn(username,password);

    }

    @Override
    public void loginSuccess() {
        loginView.goHome();

        loginView.hideprogressBar();
    }

    @Override
    public void loginError(String error) {

        loginView.enabledInputs();
        loginView.hideprogressBar();
        loginView.loginError(error);
    }
}
