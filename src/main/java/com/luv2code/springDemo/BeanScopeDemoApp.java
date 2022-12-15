package com.luv2code.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        //load the configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
        //retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", TrackCoach.class);
        Coach alphaCoach = context.getBean("myCoach", TrackCoach.class);
        Boolean result = (theCoach == alphaCoach);

        System.out.println(result);
        System.out.println(alphaCoach);
        System.out.println(theCoach);
    }
}
