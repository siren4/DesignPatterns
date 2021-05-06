package com.siren.liu.sample.pattern.create.factory;

public class DellMouse implements IMouse {
    @Override
    public void click() {
        System.out.println("我是戴尔鼠标！");
    }
}
