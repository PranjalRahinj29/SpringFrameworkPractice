package com.pranjal.constructorinjection;

public class BaseBallCoach implements Coach {
    //Define private field for injection
    private Fortune fortune;

    //define constructor for injection
    public BaseBallCoach(Fortune thefortune){
        fortune = thefortune;
    }
    public  String getDailyWorkout(){
        return " i am fit now";
    }

    public String getDailyFortune(){
        return fortune.getFortune();
    }
}
