package org.sireniu.pattern.behavior.iterator;

public class DirectorLeaveHandler extends LeaveHandler {
    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.leaveDays <= 3) {
            System.out.println("休假天数少于3天，主管审批通过!");
        } else {
            getNextHandler().handleRequest(request);
        }
    }
}
