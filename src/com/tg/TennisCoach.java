package com.tg;

import org.springframework.beans.factory.annotation.Value;

public class TennisCoach implements Coach {

    private FortuneInterface fortuneInterface;
    @Value("${myVar.email}")
    private String email;
    @Value("${myVar.team}")
    private String team;

    public TennisCoach(FortuneInterface fortuneInterface) {
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

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
}
