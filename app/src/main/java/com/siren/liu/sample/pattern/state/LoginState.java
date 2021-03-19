package com.siren.liu.sample.pattern.state;

public class LoginState implements UserState {
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