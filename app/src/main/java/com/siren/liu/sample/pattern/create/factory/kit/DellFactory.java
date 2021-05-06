package com.siren.liu.sample.pattern.create.factory.kit;

import com.siren.liu.sample.pattern.create.factory.DellMouse;
import com.siren.liu.sample.pattern.create.factory.IMouse;

public class DellFactory implements PcFactory {
    @Override
    public IMouse createMouse() {
        return new DellMouse();
    }

    @Override
    public IKeyboard createKeyboard() {
        return new DellKeyboard();
    }
}
