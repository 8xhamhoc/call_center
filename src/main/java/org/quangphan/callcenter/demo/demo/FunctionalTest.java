package org.quangphan.callcenter.demo.demo;

@FunctionalInterface
public interface FunctionalTest {

    void test();

    default void sayHello() {
        System.out.println("Say yeah");
    }

    static void defaultTest() {
        System.out.println("Show off");
    }
}
