package com.tg;

import org.springframework.stereotype.Component;

@Component("baseballCoach") // "baseballCoach" is bean id
public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }
}
