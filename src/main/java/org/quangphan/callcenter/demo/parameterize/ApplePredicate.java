package org.quangphan.callcenter.demo.parameterize;

import org.quangphan.callcenter.demo.item.Apple;

@FunctionalInterface
public interface ApplePredicate {

    boolean test(Apple apple);
}
