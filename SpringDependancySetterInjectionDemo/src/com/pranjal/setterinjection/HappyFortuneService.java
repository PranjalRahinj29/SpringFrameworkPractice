package com.pranjal.setterinjection;

public class HappyFortuneService implements Fortune{
    @Override
    public String getFortune() {
        return "I am lucky";
    }
}
