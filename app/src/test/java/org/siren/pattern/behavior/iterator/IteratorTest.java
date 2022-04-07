package org.siren.pattern.behavior.iterator;

import junit.framework.TestCase;

import org.junit.Test;

/**
 * @author Siren <a href="mailto:siren.liu@oppo.com">Contact me.</a>
 * @version 1.0.0
 * @since 2021/7/14
 */
public class IteratorTest extends TestCase {

    @Test
    public void test() {
        DirectorLeaveHandler directorLeaveHandler = new DirectorLeaveHandler();
        ManagerLeaveHandler managerLeaveHandler = new ManagerLeaveHandler();
        MinisterLeaveHandler ministerLeaveHandler = new MinisterLeaveHandler();
        //动态设置链式结构
        directorLeaveHandler.setNextHandler(managerLeaveHandler);
        managerLeaveHandler.setNextHandler(ministerLeaveHandler);
        directorLeaveHandler.handleRequest(new LeaveRequest(10));
    }
}