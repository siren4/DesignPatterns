package org.siren.pattern.structure.proxy;

import junit.framework.TestCase;

import org.junit.Test;

/**
 * @author Siren <a href="mailto:siren.liu@oppo.com">Contact me.</a>
 * @version 1.0.0
 * @since 2021/7/14
 */
public class ProxyTest extends TestCase {

    @Test
    public void test1() {
        PlaintiffProxy proxy = new PlaintiffProxy();
        proxy.submit();
    }

    @Test
    public void test2() {
        ILawsuit lawsuit = (ILawsuit) new DynamicProxy().bind(new Plaintiff());
        lawsuit.submit();
    }
}