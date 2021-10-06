package com.pranjal.setterinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringSIApp {
    public static void main(String[] args) {
        //load Spring file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");

        //retrive the bean from spring file
        CricketCoach cricketCoach=context.getBean("mycricketcoach",CricketCoach.class);

        //use the bean
            System.out.println(cricketCoach.getDailyWorkout());
            System.out.println(cricketCoach.getDailyFortune());
        //close the connection
        context.close();
    }
}
