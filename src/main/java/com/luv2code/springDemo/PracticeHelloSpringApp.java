package com.luv2code.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeHelloSpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        GolfCoach golfCoach = context.getBean("myGolfCoach", GolfCoach.class);
        System.out.println(golfCoach.getDailyFortune());
        System.out.println(golfCoach.getDailyWorkout());
        context.close();

    }
}
