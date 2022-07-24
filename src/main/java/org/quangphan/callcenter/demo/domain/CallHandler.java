package org.quangphan.callcenter.demo.domain;

public abstract class CallHandler {

    private String name;
    private boolean free = true;

    private CallRouting nextCallRouting;

    public CallHandler(String name, CallRouting nextCallRouting) {
        this.name = name;
        this.nextCallRouting = nextCallRouting;
    }

    public String getName() {
        return name;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    public CallRouting getNextCallRouting() {
        return nextCallRouting;
    }

    public abstract void handle(Call call);
}
