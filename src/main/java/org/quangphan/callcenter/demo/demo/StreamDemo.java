package org.quangphan.callcenter.demo.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String[] args) {

//        List<Integer> integers = new ArrayList<>();
//        Random random = new Random();
//
//        for (int i=0; i<10000000; i++) {
//            integers.add(random.nextInt(6));
//        }
//
//        long startTime1 = System.currentTimeMillis();
//
//        List<Integer> filters1 = integers.stream()
//                .filter(item -> item == 5)
//                .collect(Collectors.toList());
//
//        System.out.println("size: " + filters1.size());
//
//        long endTime1 = System.currentTimeMillis();
//        System.out.println("Total time spent: " + (endTime1 - startTime1));
//
//        long startTime2 = System.currentTimeMillis();
//
//        List<Integer> filters2 = new ArrayList<>();
//
//        for (Integer integer : integers) {
//            if (integer == 5) {
//                filters2.add(integer);
//            }
//        }
//
//        System.out.println("size: " + filters2.size());
//
//        long endTime2 = System.currentTimeMillis();
//        System.out.println("Total time spent: " + (endTime2 - startTime2));

        FunctionalTestImpl functionalTest = new FunctionalTestImpl();
        functionalTest.test();

    }

}
