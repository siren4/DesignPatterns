package com.siren.liu.sample.pattern.state;

public class LogoutState implements UserState {
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