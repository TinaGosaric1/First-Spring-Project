package com.tg;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("myTrackCoach", Coach.class);
        Coach alphaCoach = context.getBean("myTrackCoach", Coach.class);

        System.out.println("Is this the same object in memory? " + (boolean) (theCoach == alphaCoach));

        System.out.println("Memory location: " + theCoach);
        System.out.println("Memory location: " + alphaCoach);

        // close the context
        context.close();
    }
}
