package org.siren.pattern.structure.adapter;

/**
 * @author Siren <a href="mailto:siren.liu@oppo.com">Contact me.</a>
 * @version 1.0.0
 * @desc 类适配器
 * @since 2021/11/16
 */
public class ExtendsAdapter extends Usber implements HDMI {
    @Override
    public void outHDMI() {
        outUSB();
        System.out.println("++接收USB信号，并且转换成HDMI信号++");
    }
}
