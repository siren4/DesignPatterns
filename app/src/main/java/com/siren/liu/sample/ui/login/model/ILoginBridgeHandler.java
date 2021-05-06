package com.siren.liu.sample.ui.login.model;

import com.siren.liu.sample.base.bridge.ScriptRequestBody;
import com.siren.liu.sample.ui.login.LoginContract;

public interface ILoginBridgeHandler {
    String onLoginSuccess(ScriptRequestBody request, LoginContract.Presenter presenter);

    String onLogout(ScriptRequestBody request, LoginContract.Presenter presenter);
}
