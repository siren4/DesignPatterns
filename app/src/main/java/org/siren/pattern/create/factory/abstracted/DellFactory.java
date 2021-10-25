package org.siren.pattern.create.factory.abstracted;

import org.siren.pattern.create.factory.simple.DellMouse;
import org.siren.pattern.create.factory.simple.IMouse;

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
