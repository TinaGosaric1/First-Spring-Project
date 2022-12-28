package com.tg;

public class TestFortuneService implements FortuneInterface {

    @Override
    public String getFortune() {
        return "Wrong fortune";
    }
}
