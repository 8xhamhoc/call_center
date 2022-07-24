package org.quangphan.callcenter.demo.domain;

import java.util.Random;

public class ClientCall extends Thread {

    private CallRouting callRouting;
    private int number;

    public ClientCall(String name, CallRouting callRouting, int number) {
        super(name);
        this.callRouting = callRouting;
        this.number = number;
    }

    @Override
    public void run() {
        Random random = new Random();
        int level = random.nextInt(3);
        Call call = new Call(number, CallLevel.from(level));
        callRouting.enqueue(call);
    }
}
