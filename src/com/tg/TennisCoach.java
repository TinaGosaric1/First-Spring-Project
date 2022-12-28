package com.tg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") // creates new instance every time
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
}
