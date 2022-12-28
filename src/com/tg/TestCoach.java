package com.tg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TestCoach implements Coach {

    private FortuneInterface fortuneInterface;

    @Autowired
    public TestCoach(@Qualifier("testFortuneService") FortuneInterface fortuneInterface) {
        this.fortuneInterface = fortuneInterface;
    }

    @Override
    public String getDailyWorkout() {
        return "Wrong workout";
    }

    @Override
    public String getDailyFortune() {
        return fortuneInterface.getFortune();
    }
}