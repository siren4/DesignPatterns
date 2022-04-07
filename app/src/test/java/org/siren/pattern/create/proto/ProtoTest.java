package org.siren.pattern.create.proto;

import junit.framework.TestCase;

import org.junit.Test;

/**
 * @author Siren <a href="mailto:siren.liu@oppo.com">Contact me.</a>
 * @version 1.0.0
 * @since 2021/7/14
 */
public class ProtoTest extends TestCase {

    @Test
    public void test() {
        OrderFormCard orderForm = new OrderFormCard("JK001", new OrderFormDetail());
        OrderFormCard orderForm2 = orderForm.clone();
        OrderFormCard orderForm3 = orderForm.clone();
    }
}