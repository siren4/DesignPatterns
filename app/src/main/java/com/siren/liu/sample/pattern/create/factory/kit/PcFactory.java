package com.siren.liu.sample.pattern.create.factory.kit;

import com.siren.liu.sample.pattern.create.factory.IMouse;

public interface PcFactory {
    IMouse createMouse();

    IKeyboard createKeyboard();
}
