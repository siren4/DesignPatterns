package com.siren.liu.sample.ui.login;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

import androidx.annotation.Nullable;

import com.siren.liu.sample.R;

public class LoginActivity extends Activity implements LoginContract.View {
    private LoginContract.Presenter presenter;
    private WebView webView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);
        webView = findViewById(R.id.wv);
        presenter = new LoginPresenter(this);
        webView.addJavascriptInterface(presenter.obtainBridge(), "JSBridge");
        webView.loadUrl("xxx");
    }

    @Override
    public void fun1(Object object) {

    }

    @Override
    public void fun2(Object object) {

    }
}
