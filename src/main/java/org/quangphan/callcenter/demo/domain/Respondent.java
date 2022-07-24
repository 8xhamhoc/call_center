package org.quangphan.callcenter.demo.domain;

public class Respondent extends CallHandler {

    public Respondent(String name, CallRouting nextCallRouting) {
        super(name, nextCallRouting);
    }

    @Override
    public void handle(Call call) {
        setFree(false);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {

        }
        if (call.getLevel() == CallLevel.SUPPORT) {
            System.out.println(getName() + " takes the call number " + call.getNumber());
            setFree(true);
        } else if (getNextCallRouting() != null) {
            setFree(true);
            getNextCallRouting().enqueue(call);
        }
    }
}
