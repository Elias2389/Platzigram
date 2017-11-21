package com.erivas.platzigram.login.view;

/**
 * Created by erivas on 11/20/17.
 */

public interface LoginView {
    void enabledInputs();
    void disabledInputs();

    void showProgressbar();
    void hideprogressBar();

    void loginError(String error);

    void goCreateAccount();
    void goHome();
    void goToWebPage();

}
