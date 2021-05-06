package com.siren.liu.sample.ui.login.model;

import com.siren.liu.sample.base.bridge.BaseBridgeHandler;
import com.siren.liu.sample.base.bridge.ScriptRequestBody;
import com.siren.liu.sample.ui.login.LoginContract;

public class LoginBridgeHandler extends BaseBridgeHandler implements ILoginBridgeHandler {
    public LoginBridgeHandler() {
        registerMethod(ILoginBridgeHandler.class);
    }

    @Override
    public String onLoginSuccess(ScriptRequestBody request, LoginContract.Presenter presenter) {
        return null;
    }

    @Override
    public String onLogout(ScriptRequestBody request, LoginContract.Presenter presenter) {
        return null;
    }
}
