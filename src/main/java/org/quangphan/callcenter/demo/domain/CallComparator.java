package org.quangphan.callcenter.demo.domain;

import java.util.Comparator;

public class CallComparator implements Comparator<Call> {

    @Override
    public int compare(Call o1, Call o2) {
        if (o1.getStartTime().getEpochSecond() < o2.getStartTime().getEpochSecond()) {
            return 1;
        } else {
            return -1;
        }
    }
}
