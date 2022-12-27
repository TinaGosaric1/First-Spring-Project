package com.tg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component // now we use default bean id, in this case baseballCoach (lower first letter)
public class BaseballCoach implements Coach {

    // inject the values from properties file

    @Value("${myVar.email}")
    private String email;

    @Value("${myVar.team}")
    private String team;

    private FortuneService fortuneService;

    // qualifier + setter injection
    @Autowired
    @Qualifier("randomFortuneService")
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
        System.out.println("Team name: " + team);
        System.out.println("Email: " + email);
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
