package org.siren.pattern.behavior.state;

public class UserContext {
    private IUser currentState = new LoginState();

    private static final class SingletonHolder {
        private static final UserContext INSTANCE = new UserContext();
    }

    private UserContext() {
    }

    public static UserContext getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void setState(IUser state) {
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
