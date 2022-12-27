package com.tg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component // now we use default bean id, in this case baseballCoach (lower first letter)
public class BaseballCoach implements Coach {
    private FortuneService fortuneService;

    public BaseballCoach() {
        System.out.println(">>> BaseballCoach: inside the default constructor");
    }

    @Autowired
    public BaseballCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
        System.out.println(">> BaseballCoach: inside constructor using autowired and qualifier");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
