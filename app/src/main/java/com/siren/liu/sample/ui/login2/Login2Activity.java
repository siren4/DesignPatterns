package com.siren.liu.sample.ui.login2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

import com.oneplus.accountsdk.OPAuth;
import com.oneplus.accountsdk.auth.OPAuthListener;
import com.oneplus.accountsdk.entity.AuthUserInfo;
import com.siren.liu.sample.R;

public class Login2Activity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
    }

    public void onLogin(View view) {
        OPAuth.reqLogin(this, new OPAuthListener<AuthUserInfo>() {
            @Override
            public void onReqStart() {

            }

            @Override
            public void onReqLoading() {

            }

            @Override
            public void onReqFinish(AuthUserInfo authUserInfo) {

            }

            @Override
            public void onReqComplete() {

            }
        });
    }

    public void onLogout(View view) {
        OPAuth.reqLogout(this);
    }
}
