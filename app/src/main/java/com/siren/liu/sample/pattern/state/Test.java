package com.siren.liu.sample.pattern.state;

public class Test {

    public static void test() {
        UserStateContext.getInstance().setState(new LoginState());
        UserStateContext.getInstance().buy();
        //根据具体业务切换状态
        UserStateContext.getInstance().setState(new LogoutState());
        UserStateContext.getInstance().buy();
    }
}
