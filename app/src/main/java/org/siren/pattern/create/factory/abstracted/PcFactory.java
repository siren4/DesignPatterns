package org.siren.pattern.create.factory.abstracted;

import org.siren.pattern.create.factory.simple.IMouse;

public interface PcFactory {
    IMouse createMouse();

    IKeyboard createKeyboard();
}
