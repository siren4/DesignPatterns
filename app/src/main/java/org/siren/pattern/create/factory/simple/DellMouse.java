package org.siren.pattern.create.factory.simple;

public class DellMouse implements IMouse {
    @Override
    public void click() {
        System.out.println("我是戴尔鼠标！");
    }
}
