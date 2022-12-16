package com.tg;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyFirstSpringApp {
    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach1 = context.getBean("myCoach1", Coach.class);
        Coach theCoach2 = context.getBean("myCoach2", Coach.class);

        // call methods on the bean
        System.out.println(theCoach1.getDailyWorkout());
        System.out.println(theCoach2.getDailyWorkout());

        // close the context
        context.close();
    }
}
