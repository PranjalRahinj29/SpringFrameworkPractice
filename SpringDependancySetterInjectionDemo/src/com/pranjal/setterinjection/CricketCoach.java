package com.pranjal.setterinjection;

public class CricketCoach implements Coach{
    private Fortune fortune;
    public CricketCoach(){
      System.out.println("Inside the CricketCoach :No Argument Constructor");
    }
   //setter method
    public void setFortune(Fortune fortune) {
        System.out.println("Inside the CricketCoach :Setter Method - setFortune");
        this.fortune = fortune;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast for bowling";
    }

    @Override
    public String getDailyFortune() {
        return fortune.getFortune();
    }
}
