package com.pranjal.constructorinjection;

public class TrackCoach implements Coach{
    private  Fortune fortune;
    public TrackCoach(){

    }

    public TrackCoach(Fortune thefortune){
        fortune = thefortune;
    }
    public  String getDailyWorkout(){
        return "Speed is max";
    }
    public String getDailyFortune(){
        return "just do for it " + fortune.getFortune();
    }
}
