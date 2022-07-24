package org.quangphan.callcenter.demo.domain;

public class Director extends CallHandler {

    public Director(String name, CallRouting nextCallRouting) {
        super(name, nextCallRouting);
    }

    @Override
    public void handle(Call call) {
        setFree(false);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {

        }
        System.out.println(getName() + " takes the number " + call.getNumber());
        setFree(true);
    }
}
