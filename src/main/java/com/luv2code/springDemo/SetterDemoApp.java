package com.luv2code.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
        theCoach.getDailyWorkout();
        theCoach.getDailyFortune();
        System.out.println(theCoach.getTeam());
        System.out.println(theCoach.getEmailAddress());
        context.close();
    }
}
