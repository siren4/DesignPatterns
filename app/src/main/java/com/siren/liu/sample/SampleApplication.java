package com.siren.liu.sample;

import android.app.Application;

import com.oneplus.accountsdk.OPAuth;
import com.oneplus.accountsdk.config.OPAuthEnvConfig;
import com.oneplus.membership.sdk.OPMemberAgent;

public class SampleApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initAccountSDK();
        initMemberSDK();
    }

    private void initAccountSDK() {
        OPAuth.initConfig(new OPAuthEnvConfig.Builder()
                .clientId(Constants.clientId())
                .clientSecret(Constants.clientSecret())
                .privateKey(Constants.privateKey())
                .serverUrl(Constants.serverUrl())
                .webUrl(Constants.webUrl())
                .debug(true)
                .overSea(true)
                .context(this));
    }

    private void initMemberSDK() {
        OPMemberAgent.init(new OPMemberAgent.Builder()
                .setAlitaClientId(Constants.clientId())
                .setAlitaClientSecret(Constants.clientSecret())
                .setAlitaPrivateKey(Constants.privateKey())
                .setAlitaGatewayURL(Constants.serverUrl())
                .setWebURL(Constants.webUrl())
                .build(this));
    }
}
