package com.tg;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach1 = context.getBean("tennisCoach", Coach.class);
        Coach theCoach2 = context.getBean("tennisCoach", Coach.class);

        System.out.println(theCoach1 == theCoach2);
        System.out.println("Memory location for theCoach1: " + theCoach1);
        System.out.println("Memory location for theCoach2: " + theCoach2);

        context.close();
    }
}