package com.nqh.lab2x6;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

public BaseballCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practice";
    }


    public String getDailyFortune(){
        return fortuneService.getFortune();
    }
}
