package com.siren.liu.sample.pattern.state;

public class UnitTest {

    public void test() {
        UserContext.getInstance().setState(new LoginState());
        UserContext.getInstance().buy();
        //根据具体业务切换状态
        UserContext.getInstance().setState(new LogoutState());
        UserContext.getInstance().buy();
    }
}
