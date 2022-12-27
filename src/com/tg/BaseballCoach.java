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

    // qualifier + setter injection
    @Autowired
    @Qualifier("randomFortuneService")
    public void setFortuneService(FortuneService fortuneService) {
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
