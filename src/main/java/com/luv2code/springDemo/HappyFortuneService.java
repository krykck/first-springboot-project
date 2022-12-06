package com.luv2code.springDemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService{

    /*public String[] setFortune() {
        String[] fortunes = new String[3];
        fortunes[0] = "You'll be a millionare";
        fortunes[1] = "You'll be poor";
        fortunes[2] = "You'll be dead";
        return fortunes;
    }*/



    @Override
    public String getFortune() {

        return "Whatever";
    }
}
