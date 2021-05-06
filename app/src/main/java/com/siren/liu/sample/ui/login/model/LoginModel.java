package com.siren.liu.sample.ui.login.model;

import com.google.gson.Gson;
import com.siren.liu.sample.base.bridge.BaseBridge;
import com.siren.liu.sample.base.bridge.BaseBridgeHandler;
import com.siren.liu.sample.base.bridge.ScriptRequestBody;
import com.siren.liu.sample.ui.login.LoginContract;

public class LoginModel extends BaseBridge implements LoginContract.Model {
    private LoginContract.Presenter presenter;
    private BaseBridgeHandler handler;

    public LoginModel(LoginContract.Presenter presenter) {
        this.presenter = presenter;
        this.handler = new LoginBridgeHandler();
    }

    @Override
    protected boolean checkMethod(String methodName) {
        return handler.hasMethod(methodName);
    }

    @Override
    protected String sync(String params) {
        try {
            Gson gson = new Gson();
            ScriptRequestBody request = gson.fromJson(params, ScriptRequestBody.class);
            return handler.invoke(request.method, handler, request, presenter);
        } catch (BaseBridgeHandler.NotFoundMethodException e) {
        } catch (Exception e) {

        }
        return null;
    }

    @Override
    protected void async(String params) {

    }
}
