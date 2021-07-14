package org.sireniu.pattern.behavior.state;

public class LoginState implements IUser {
    @Override
    public void buy() {
        System.out.println("登录成功，尝试购买");
    }

    @Override
    public void follow() {
        System.out.println("登录成功，尝试关注");
    }

    @Override
    public void comment() {
        System.out.println("登录成功，尝试评论");
    }
}
