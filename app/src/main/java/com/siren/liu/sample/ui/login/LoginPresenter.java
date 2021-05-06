package com.siren.liu.sample.ui.login;

import com.siren.liu.sample.ui.login.model.LoginModel;

public class LoginPresenter implements LoginContract.Presenter {
    private LoginContract.View view;
    private LoginContract.Model model;

    public LoginPresenter(LoginContract.View view) {
        this.view = view;
        model = new LoginModel(this);
    }

    @Override
    public LoginContract.Model obtainBridge() {
        return model;
    }

    @Override
    public void fun1(Object object) {
        view.fun1(object);
    }

    @Override
    public void fun2(Object object) {
        view.fun2(object);
    }
}
