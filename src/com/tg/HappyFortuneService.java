package com.tg;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
