package com.tg;

import java.util.ArrayList;
import java.util.Random;

public class HappyFortuneService implements FortuneService {

    private ArrayList<String> fortunes = new ArrayList<>();
    private Random myRandom = new Random();

    public HappyFortuneService() {
        this.fortunes.add("My First Fortune");
        this.fortunes.add("My Second Fortune");
        this.fortunes.add("My Third Fortune");
    }

    @Override
    public String getFortune() {
        int index = myRandom.nextInt(fortunes.size());
        return fortunes.get(index);
    }
}
