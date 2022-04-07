package org.siren.pattern.create.factory;

import junit.framework.TestCase;

import org.junit.Test;
import org.siren.pattern.create.factory.abstracted.DellFactory;
import org.siren.pattern.create.factory.abstracted.HpFactory;
import org.siren.pattern.create.factory.method.AsusMouseFactory;
import org.siren.pattern.create.factory.method.DellMouseFactory;
import org.siren.pattern.create.factory.method.HpMouseFactory;
import org.siren.pattern.create.factory.simple.IMouse;
import org.siren.pattern.create.factory.simple.MouseFactory;

/**
 * @author Siren <a href="mailto:siren.liu@oppo.com">Contact me.</a>
 * @version 1.0.0
 * @since 2021/7/16
 */
public class FactoryTest extends TestCase {

    @Test
    public void test1() {
        IMouse mouse1 = MouseFactory.createMouse("Dell");
        IMouse mouse2 = MouseFactory.createMouse("Hp");
        mouse1.click();
        mouse2.click();
    }

    @Test
    public void test2() {
        IMouse dellMouse = new DellMouseFactory().createMouse();
        IMouse hpMouse = new HpMouseFactory().createMouse();
        IMouse asusMouse = new AsusMouseFactory().createMouse();
        dellMouse.click();
        hpMouse.click();
        asusMouse.click();
    }

    @Test
    public void test3() {
        DellFactory dellFactory = new DellFactory();
        HpFactory hpFactory = new HpFactory();
        dellFactory.createMouse().click();
        dellFactory.createKeyboard().input();
        hpFactory.createMouse().click();
        hpFactory.createKeyboard().input();
    }

}