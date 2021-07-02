package com.siren.liu.sample.pattern.create.factory.abstracted;

import com.siren.liu.sample.pattern.create.factory.HpMouse;
import com.siren.liu.sample.pattern.create.factory.IMouse;

public class HpFactory implements PcFactory {
    @Override
    public IMouse createMouse() {
        return new HpMouse();
    }

    @Override
    public IKeyboard createKeyboard() {
        return new HpKeyboard();
    }
}
