package com.erivas.platzigram.login.interactor;

import com.erivas.platzigram.login.presenter.LoginPresenter;
import com.erivas.platzigram.login.repository.LoginRepository;
import com.erivas.platzigram.login.repository.LoginRepositoryImpl;

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
    public void signIn(String username, String password) {
        repository.signIn(username,password);
    }
}
