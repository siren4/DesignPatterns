package com.siren.liu.sample.pattern.state;

public class UserStateContext {
    private UserState currentState = new LoginState();

    private static final class SingletonHolder {
        private static final UserStateContext INSTANCE = new UserStateContext();
    }

    private UserStateContext() {
    }

    public static UserStateContext getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void setState(UserState state) {
        currentState = state;
    }

    public void buy() {
        currentState.buy();
    }

    public void follow() {
        currentState.follow();
    }

    public void comment() {
        currentState.comment();
    }
}
