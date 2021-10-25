package org.siren.pattern.create.factory.simple;

public class HpMouse implements IMouse {
    @Override
    public void click() {
        System.out.println("我是惠普鼠标！");
    }
}
