package org.siren.pattern.structure.adapter;

import junit.framework.TestCase;

import org.junit.Test;

/**
 * @author Siren <a href="mailto:siren.liu@oppo.com">Contact me.</a>
 * @version 1.0.0
 * @since 2021/11/16
 */
public class AdapterTest extends TestCase {

    @Test
    public void test() {
        HDMI extendHDMI = new ExtendsAdapter();
        extendHDMI.outHDMI();

        HDMI composeHDMI = new ComposeAdapter(new Usber());
        composeHDMI.outHDMI();
    }
}