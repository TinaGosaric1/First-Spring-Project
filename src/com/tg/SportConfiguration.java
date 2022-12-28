package com.tg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
public class SportConfiguration {

    @Bean
    public FortuneInterface myFortuneInterface() {
        return new FortuneService();
    }

    @Bean
    public Coach myTennisCoach() {
        return new TennisCoach(myFortuneInterface());
    }
}
