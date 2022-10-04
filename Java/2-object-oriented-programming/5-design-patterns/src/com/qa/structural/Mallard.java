package com.qa.structural;

public class Mallard implements Duck {

    public Mallard(){}

    @Override
    public void quack() {
        System.out.println("wak");
    }

    @Override
    public void fly() {
        System.out.println("i am doing a fly, i am");
    }
}