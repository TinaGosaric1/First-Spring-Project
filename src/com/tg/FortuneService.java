package com.tg;

public class FortuneService implements FortuneInterface {

    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
