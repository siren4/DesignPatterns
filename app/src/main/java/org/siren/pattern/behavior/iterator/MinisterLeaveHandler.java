package org.siren.pattern.behavior.iterator;

public class MinisterLeaveHandler extends LeaveHandler {

    @Override
    public void handleRequest(LeaveRequest request) {
        System.out.println("休假天数大于10天，部长审批通过!");
    }
}
