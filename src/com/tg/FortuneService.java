package com.tg;

import org.springframework.stereotype.Component;

@Component
public class FortuneService implements FortuneInterface {

    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
