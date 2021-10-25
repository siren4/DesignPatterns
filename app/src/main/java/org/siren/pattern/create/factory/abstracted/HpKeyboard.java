package org.siren.pattern.create.factory.abstracted;

public class HpKeyboard implements IKeyboard {
    @Override
    public void input() {
        System.out.println("我是惠普键盘！");
    }
}
