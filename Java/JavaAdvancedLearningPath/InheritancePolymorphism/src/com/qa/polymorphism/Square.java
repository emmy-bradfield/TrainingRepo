package com.qa.polymorphism;

public class Square extends Shape{

    Double length;
    Double area;

    public Square(){
    this.length = Math.random()*30;
    this.area = getLength()*getLength();
    }

    @Override
    public void draw(){
        System.out.println("Drawing square");
    }

    public double getLength(){
        return length;
    }

    public double getArea(){
        return area;
    }
} 

