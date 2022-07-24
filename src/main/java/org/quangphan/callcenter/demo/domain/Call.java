package org.quangphan.callcenter.demo.domain;

import java.time.Instant;

public class Call {

    private int number;
    private CallLevel level;
    private Instant startTime;

    public Call(int number, CallLevel level) {
        this.number = number;
        this.level = level;
        this.startTime = Instant.now();
    }

    public CallLevel getLevel() {
        return level;
    }

    public int getNumber() {
        return number;
    }

    public Instant getStartTime() {
        return startTime;
    }
}
