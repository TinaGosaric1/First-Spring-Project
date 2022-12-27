package com.tg;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {
    private ArrayList<String> fortunes = new ArrayList<>();
    private Random myRandom = new Random();

    public RandomFortuneService() {
        fortunes.add("Today is your lucky day!");
        fortunes.add("Your dog loves you <3");
        fortunes.add("No Java next week (only C++)");
    }

    @Override
    public String getFortune() {
        int myIndex = myRandom.nextInt(fortunes.size());
        return fortunes.get(myIndex);
    }
}