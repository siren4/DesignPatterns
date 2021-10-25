package org.siren.pattern.create.factory.abstracted;

public class DellKeyboard implements IKeyboard {
    @Override
    public void input() {
        System.out.println("我是戴尔键盘!");
    }
}
