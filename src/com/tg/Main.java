package com.tg;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach theBCoach = context.getBean("myBaseballCoach", Coach.class);
        Coach theTCoach = context.getBean("myTrackCoach", Coach.class);
        FootballCoach theFCoach = context.getBean("myFootballCoach", FootballCoach.class);

        // call methods on the bean
        System.out.println(theBCoach.getDailyWorkout());
        System.out.println(theFCoach.getDailyWorkout());

        System.out.println(theBCoach.getDailyFortune());
        System.out.println(theFCoach.getDailyFortune());

        // call our new methods to get the literal values
        System.out.println(theFCoach.getEmailAddress());
        System.out.println(theFCoach.getTeam());

        // close the context
        context.close();
    }
}
