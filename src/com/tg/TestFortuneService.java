package com.tg;

import org.springframework.stereotype.Component;

@Component
public class TestFortuneService implements FortuneInterface {

    @Override
    public String getFortune() {
        return "Wrong fortune";
    }
}
