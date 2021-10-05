package com.pranjal.constructorinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringCIApp {
    public static void main(String[] args) {
        // 1. Load Spring configuration file
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");

        // 2. retrieve bean from spring container i.e application applicationContext
        Coach coach = applicationContext.getBean("myCoach", Coach.class);

        // 3. use bean
        System.out.println(coach.getDailyWorkout());

        System.out.println(coach.getDailyFortune());

        //4. close application applicationContext
        applicationContext.close();
    }
}
