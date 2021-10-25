package org.siren.pattern.behavior.iterator;

public class IteratorUnit {

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
