package com.sparta.week01.prac;

import java.util.ArrayList;
import java.util.List;

public class Prac {
    // 파라미터 X, 반환값 X
    public static void simplePrint() {
        System.out.println("파라미터도 없고, 반환값도 없어요!");
    }

    // 파라미터 O, 반환값 X
    public static void simpleSum(int num1, int num2) {
        System.out.println("num1: " + num1 + ", num2: " + num2);
    }

    // 파라미터 X, 반환값 O
    public static int simpleReturn() {
        return 3;
    }

    // 파라미터 O, 반환값 O
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int sub(int num1, int num2) {
        return num1 - num2;
    }

    public static int countFruit(String fruit) {
        List<String> fruits = new ArrayList<>();
        int count = 0;

        fruits.add("감");
        fruits.add("배");
        fruits.add("감");
        fruits.add("딸기");
        fruits.add("수박");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("딸기");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("감");

        for(int j = 0; j < fruits.size(); j++){
            if(fruits.get(j) == fruit)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        String course1 = "웹개발 종합반";
        String course2 = "앱개발 종합반";
        List<String> courseList = new ArrayList<>();
        courseList.add(course1);
        courseList.add(course2);

        System.out.println(courseList);

        System.out.println(sub(1, 3));

        List<String> celebs = new ArrayList<>();
        celebs.add("아이유");
        celebs.add("린다G");
        celebs.add("은비");
        celebs.add("금비");
        celebs.add("비");
        celebs.add("차은우");
        celebs.add("남주혁");
        celebs.add("수지");
        celebs.add("정우성");
        celebs.add("제니");
        celebs.add("정국");

        for(int i = 0; i < celebs.size(); i++)
            System.out.println(celebs.get(i));

        int fruitNum = countFruit("감");
        System.out.println(fruitNum);

        Course course = new Course();
        course.title = "웹개발의 봄, Spring";
        System.out.println(course.title);
        System.out.println(course.tutor);
        System.out.println(course.days);

        Course course3 = new Course("웹개발의 봄, 스프링", "남병관", 35);
        System.out.println(course3.title);
        System.out.println(course3.tutor);
        System.out.println(course3.days);

    }

}
