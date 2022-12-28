package com.tg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {

    private FortuneInterface fortuneInterface;

    @Autowired
    public TennisCoach(@Qualifier("fortuneService") FortuneInterface fortuneInterface) {
        this.fortuneInterface = fortuneInterface;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneInterface.getFortune();
    }

    // this method will execute after constructor and injection of dependencies
    @PostConstruct
    public void startup() {
        System.out.println("Inside PostConstruct.");
    }

    // this method will execute before the bean is destroyed
    @PreDestroy
    public void cleanup() {
        System.out.println("Inside PreDestroy.");
    }
}
