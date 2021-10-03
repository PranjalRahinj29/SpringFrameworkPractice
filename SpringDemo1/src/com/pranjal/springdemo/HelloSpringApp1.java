package com.pranjal.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp1 {
    public static void main(String[] args) {
        // 1. Load Spring configuration file
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 2. retrieve bean from spring container i.e application applicationContext
        Coach coach = applicationContext.getBean("myCoach", Coach.class);

        // 3. use bean
        System.out.println(coach.getDailyWorkout());

        //4. close application applicationContext
        applicationContext.close();
    }
}
