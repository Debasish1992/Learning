package com.debasish.mvparc.Presenter;

public interface ILoginPresenter {

    void onLogin(String email, String password);

    void inLoginError(String message);


}
