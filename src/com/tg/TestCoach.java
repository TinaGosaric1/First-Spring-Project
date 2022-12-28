package com.tg;

public class TestCoach implements Coach {

    private FortuneInterface fortuneInterface;

    public TestCoach(FortuneInterface fortuneInterface) {
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