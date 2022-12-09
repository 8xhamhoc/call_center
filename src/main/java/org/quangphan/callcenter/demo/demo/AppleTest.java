package org.quangphan.callcenter.demo.demo;

import org.quangphan.callcenter.demo.item.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AppleTest {

    public static void main(String[] args) {

        List<Apple> apples = Arrays.asList(
                createApple("green", 100),
                createApple("red", 50),
                createApple("red", 40),
                createApple("green", 60),
                createApple("blue", 100),
                createApple("yellow", 100),
                createApple("green", 30)
        );

        List<Apple> filterApples = filterApples(apples, AppleTest::isGreenApple);

        for (Apple apple : filterApples) {
            System.out.println("color: " + apple.getColor() + " - weight: " + apple.getWeight());
        }

    }


    private static List<Apple> filterApples(List<Apple> apples, Predicate<Apple> p) {
        List<Apple> filters = new ArrayList<>();

        for (Apple apple : apples) {
            if (p.test(apple)) {
                filters.add(apple);
            }
        }

        return filters;
    }

    private static boolean isGreenApple(Apple apple) {
        return "green".equals(apple.getColor());
    }

    private static boolean isHeavyApple(Apple apple) {
        return apple.getWeight() >= 50;
    }

    private static Apple createApple(String color, Integer weight) {
        return new Apple(color, weight);
    }

}
