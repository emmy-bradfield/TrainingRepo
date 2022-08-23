package com.qa.polymorphism;

public class Circle extends Shape{

    Double radius;

    public Circle(){
        this.radius = Math.random()*10;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle...");
    };

    public Double getRadius(){
        return radius;
    }
    
}
