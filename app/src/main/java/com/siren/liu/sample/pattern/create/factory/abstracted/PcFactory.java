package com.siren.liu.sample.pattern.create.factory.abstracted;

import com.siren.liu.sample.pattern.create.factory.IMouse;

public interface PcFactory {
    IMouse createMouse();

    IKeyboard createKeyboard();
}
