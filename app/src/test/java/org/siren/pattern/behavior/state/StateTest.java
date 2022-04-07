package org.siren.pattern.behavior.state;

import junit.framework.TestCase;

import org.junit.Test;

/**
 * @author Siren <a href="mailto:siren.liu@oppo.com">Contact me.</a>
 * @version 1.0.0
 * @since 2021/7/14
 */
public class StateTest extends TestCase {

    @Test
    public void test() {
        UserContext.getInstance().setState(new LoginState());
        UserContext.getInstance().buy();
        //根据具体业务切换状态
        UserContext.getInstance().setState(new LogoutState());
        UserContext.getInstance().buy();
    }
}