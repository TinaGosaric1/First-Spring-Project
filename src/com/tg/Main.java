package com.tg;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        FootballCoach theFCoach = context.getBean("myFootballCoach", FootballCoach.class);

        // call methods on the bean

        System.out.println(theFCoach.getEmailAddress());
        System.out.println(theFCoach.getTeam());
        System.out.println(theFCoach.getDailyFortune());

        // close the context
        context.close();
    }
}
