package com.pranjal.constructorinjection;

public class HappyFortuneService implements Fortune{

    @Override
    public String getFortune() {
        return "I Am Lucky";
    }
}
