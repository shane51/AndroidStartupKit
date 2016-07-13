package com.thoughtworks.startup.ui.signup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.thoughtworks.startup.R;
import com.thoughtworks.startup.ui.base.BaseActivity;
import com.thoughtworks.startup.ui.signin.SignInActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SignUpActivity extends BaseActivity implements SignUpView {

    @BindView(R.id.phone)
    EditText phoneNumber;
    @BindView(R.id.sms_code)
    EditText smsCode;
    @BindView(R.id.phone_signup_form)
    View signUpForm;

//    @Inject
//    SignUpPresenter mSignUpPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        getActivityComponent().inject(this);
        ButterKnife.bind(this);
//        mSignUpPresenter.attachView(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        mSignUpPresenter.detachView();
    }

    @OnClick(R.id.signup_button)
    void signUp() {

    }

    @OnClick(R.id.link_signin)
    void navToSignIn() {
        Intent intent = new Intent(SignUpActivity.this, SignInActivity.class);
        startActivity(intent);
    }


    @Override
    public void showSignUpSuccess() {

    }

    @Override
    public void showSignUpFailed() {

    }

    @Override
    public void showSignUpPhoneInvalid() {

    }

    @Override
    public void showPhoneIsEmpty() {

    }

    @Override
    public void showSmsCodeIsEmpty() {

    }

    @Override
    public void showProgress(boolean show) {

    }
}
