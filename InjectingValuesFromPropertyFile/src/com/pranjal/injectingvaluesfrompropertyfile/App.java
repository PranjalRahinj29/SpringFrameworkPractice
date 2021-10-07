package com.pranjal.injectingvaluesfrompropertyfile;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");

        HelloInjectingValuesFromProperty myProperty = applicationContext.getBean("myClass", HelloInjectingValuesFromProperty.class);

        System.out.println("EmailAddress :" + myProperty.getEmailAddress());
        System.out.println("Password :" + myProperty.getPassword());


    }
}
