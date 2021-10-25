package org.siren.pattern.behavior.state;

public class LogoutState implements IUser {
    @Override
    public void buy() {
        System.out.println("没有登录，尝试登录");
    }

    @Override
    public void follow() {
        System.out.println("没有登录，尝试登录");
    }

    @Override
    public void comment() {
        System.out.println("没有登录，尝试登录");
    }
}
