package com.qa.polymorphism;

public class Line extends Shape{

    public Line(){};

    @Override
    public void draw(){
        System.out.println("Drawing line...");
    }
    
}
