package com.thoughtworks.startup.ui.signup;

import com.thoughtworks.startup.ui.base.MvpView;

public interface SignUpView extends MvpView {

    void showSignUpSuccess();

    void showSignUpFailed();

    void showSignUpPhoneInvalid();

    void showPhoneIsEmpty();

    void showSmsCodeIsEmpty();

    void showProgress(boolean show);
}
