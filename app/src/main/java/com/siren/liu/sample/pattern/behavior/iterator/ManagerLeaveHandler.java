package com.siren.liu.sample.pattern.behavior.iterator;

public class ManagerLeaveHandler extends LeaveHandler {

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.leaveDays <= 10) {
            System.out.println("休假天数少于10天，经理审批通过！");
        } else {
            getNextHandler().handleRequest(request);
        }
    }
}
