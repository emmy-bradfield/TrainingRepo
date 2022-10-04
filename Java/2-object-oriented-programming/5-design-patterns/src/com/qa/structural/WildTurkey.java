package com.qa.structural;

public class WildTurkey implements Turkey {

    public WildTurkey(){}

    @Override
    public void gobble(){
        System.out.println("gobblé");
    }

    @Override
    public void fly(){
        System.out.println("i am doing a sm0l fly, because i'm bige");
    }
}