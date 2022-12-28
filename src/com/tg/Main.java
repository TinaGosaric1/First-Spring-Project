package com.tg;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfiguration.class);

        TennisCoach theCoach = context.getBean("myTennisCoach", TennisCoach.class); // myTennisCoach is the method name in SportConfiguration file
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getEmail());
        System.out.println(theCoach.getTeam());

        context.close();
    }
}