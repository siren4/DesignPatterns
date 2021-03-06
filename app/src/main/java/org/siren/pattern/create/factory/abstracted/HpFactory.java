package org.siren.pattern.create.factory.abstracted;

import org.siren.pattern.create.factory.simple.HpMouse;
import org.siren.pattern.create.factory.simple.IMouse;

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
