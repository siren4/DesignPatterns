package com.siren.liu.sample.pattern.create.factory;

public class HpMouse implements IMouse {
    @Override
    public void click() {
        System.out.println("我是惠普鼠标！");
    }
}
