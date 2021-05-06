package com.siren.liu.sample.pattern.create.factory.simple;

import com.siren.liu.sample.pattern.create.factory.AsusMouse;
import com.siren.liu.sample.pattern.create.factory.DellMouse;
import com.siren.liu.sample.pattern.create.factory.HpMouse;
import com.siren.liu.sample.pattern.create.factory.IMouse;

public class MouseFactory {
    public static IMouse createMouse(String brand) {
        switch (brand) {
            case "Dell":
                return new DellMouse();
            case "Hp":
                return new HpMouse();
            default:
                return new AsusMouse();
        }
    }
}
