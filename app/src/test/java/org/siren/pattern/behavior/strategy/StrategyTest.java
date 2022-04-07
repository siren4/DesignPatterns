package org.siren.pattern.behavior.strategy;

import junit.framework.TestCase;

import org.junit.Test;

/**
 * @author Siren <a href="mailto:siren.liu@oppo.com">Contact me.</a>
 * @version 1.0.0
 * @since 2021/7/14
 */
public class StrategyTest extends TestCase {

    @Test
    public void test() {
        MemberContext pri = new MemberContext(new PriMemberStrategy());
        pri.calcPrice(100);
        MemberContext pro = new MemberContext(new ProMemberStrategy());
        pro.calcPrice(100);
    }
}