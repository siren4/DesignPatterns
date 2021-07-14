package org.sireniu.pattern.create.factory.abstracted;

import org.sireniu.pattern.create.factory.simple.IMouse;

public interface PcFactory {
    IMouse createMouse();

    IKeyboard createKeyboard();
}
