package com.nqh.lab2x6;

public class TrackCoach implements Coach {
    public String getDailyWorkout(){
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune(){
        return null;
    }
}
