package org.quangphan.callcenter.demo.demo;

public class FunctionalTestImpl implements FunctionalTest {

    @Override
    public void test() {
        FunctionalTest.defaultTest();
        sayHello();
    }
}
