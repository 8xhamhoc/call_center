package org.quangphan.callcenter.demo.domain;

public enum CallLevel {

    SUPPORT(1), IMPORTANT(2), URGENT(3);

    private int value;

    CallLevel(int value) {
        this.value = value;
    }

    public static CallLevel from(int value) {
        for (CallLevel level : CallLevel.values()) {
            if (level.value == value) {
                return level;
            }
        }
        return null;
    }
}
