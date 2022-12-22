package com.tg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component // now we use default bean id, in this case baseballCoach (lower first letter)
public class BaseballCoach implements Coach {

    // we have two implementations of the FortuneService and now we have to specify which one we want to use
    @Autowired
    @Qualifier("randomService") // class name + lower first letter
    private FortuneService fortuneService;

    public BaseballCoach() {
        System.out.println(">>> BaseballCoach: inside the default constructor");
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
