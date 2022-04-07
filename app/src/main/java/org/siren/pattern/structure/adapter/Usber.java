package org.siren.pattern.structure.adapter;

/**
 * @author Siren <a href="mailto:siren.liu@oppo.com">Contact me.</a>
 * @version 1.0.0
 * @desc
 * @since 2022/1/28
 */
public class Usber implements USB {
    @Override
    public void outUSB() {
        System.out.println("++输出USB信号++");
    }
}
