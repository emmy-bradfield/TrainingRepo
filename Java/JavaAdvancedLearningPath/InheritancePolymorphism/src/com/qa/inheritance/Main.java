package com.qa.inheritance;

public class Main {
    public static void main(String[] args){

        Inheritance Julie = new Inheritance("green", "blonde", 168);
        Inherited Mandy = new Inherited("Mandy", Julie);
        System.out.println("Julie: " + Julie.getEyecolour() + " eyes, " + Julie.getHaircolour() + " hair, and " + Julie.getHeightCM() + "cm tall");
        System.out.println(Mandy.getName() + ": " + Mandy.getChildEyes() + " eyes, " + Mandy.getChildHair() + " hair, and " + Mandy.getChildHeight() + "cm tall");

    }
}
