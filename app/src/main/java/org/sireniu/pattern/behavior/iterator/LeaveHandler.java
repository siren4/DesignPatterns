package org.sireniu.pattern.behavior.iterator;

public abstract class LeaveHandler {
    private LeaveHandler nextHandler;

    public void setNextHandler(LeaveHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public LeaveHandler getNextHandler() {
        return nextHandler;
    }

    public abstract void handleRequest(LeaveRequest request);
}
