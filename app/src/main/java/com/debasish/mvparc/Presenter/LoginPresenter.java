package com.debasish.mvparc.Presenter;

import com.debasish.mvparc.Model.User;
import com.debasish.mvparc.View.ILoginView;

public class LoginPresenter implements ILoginPresenter {

    ILoginView loginView;

    public LoginPresenter(ILoginView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void onLogin(String email, String password) {
        User user = new User(email, password);
        int loginCode = user.isValidated();

        if(loginCode == 1)
            loginView.onLoginValidation("Please enter your email");
        else if (loginCode == 2)
            loginView.onLoginValidation("Please enter a valid email");
        else if (loginCode ==3)
            loginView.onLoginValidation("Please enter your password");
        else if (loginCode == 4)
            loginView.onLoginValidation("Password length should be equal to more than 6");
        else
            loginView.onLoginResult("Login was Success");
    }

    @Override
    public void inLoginError(String message) {

    }
}
