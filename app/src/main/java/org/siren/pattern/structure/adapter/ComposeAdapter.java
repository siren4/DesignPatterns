package org.siren.pattern.structure.adapter;

/**
 * @author Siren <a href="mailto:siren.liu@oppo.com">Contact me.</a>
 * @version 1.0.0
 * @desc 对象适配器
 * @since 2022/1/28
 */
public class ComposeAdapter implements HDMI {
    private USB usb;

    public ComposeAdapter(USB usb) {
        this.usb = usb;
    }

    @Override
    public void outHDMI() {
        usb.outUSB();
        System.out.println("++接收USB信号，并且转换成HDMI信号++");
    }
}
