package main.java.com.qa;

import java.util.Scanner;

public class Car {

    // ATTRIBUTES 

    private String make;
    private String model;
    private Integer age;
    private Integer milage;
    private Long wheelScore;
    private Long breakScore;
    private Long engineScore;
    private Boolean warningLightOn;

    //CONSTRUCTORS

    public Car(){};

    public Car(String make, String model, Integer age, Integer milage){
        this.make = make;
        this.model = model;
        this.age = age;
        this.milage = milage;
        this.wheelScore = 10L;
        this.breakScore = 10L;
        this.engineScore = (this.age > 10) ? 8 : 10L;
        this.warningLightOn = false;
    };

    // METHODS
    public void startEngine(Scanner scan){
        if (isCarBroken()) {
            System.out.println("You can't drive a broken car, silly!");
        } else {
            System.out.println("How far would you like to drive?\nPlease enter distance in whole numbers\n>>");
            Integer distance = scan.nextInt();
            scan.nextLine();
            System.out.println("How long will this take you?\nPlease enter distance in whole numbers\n>>");
            Integer time = scan.nextInt();
            scan.nextLine();
            driveCar(distance, time);
            System.out.println("What a lovely drive");
            return;
        }
    }

    public void driveCar(Integer distance, Integer time){
        Integer mph = distance/time;
        setMilage(getMilage()+distance);
        Integer wheelDamage = (distance > 200) ? 3 : 0;
        setWheelScore(getWheelScore()-wheelDamage);
        Integer engineDamage = (mph > 40) ? 2 : 1;
        setEngineScore(getEngineScore()-engineDamage);
        Integer breakDamage = (mph > 40 && distance > 200) ? 2 : 1;
        setBreakScore(getBreakScore()-breakDamage);
        if (getWarningLightOn()) System.out.println("Uh oh! Your car is making funny noises\n");
        if (isCarBroken()) System.out.print("Uh oh - you've broken down!\n");
        return;
    };

    public void isCarDamaged(){
        Boolean anyDamage = (getWheelScore() < 3 || getBreakScore() < 4 || getEngineScore() < 5) ? true : false;
        setWarningLightOn(anyDamage);
        return;
    };

    public Boolean isCarBroken(){
        Boolean broken = (getWheelScore() < 2 || getBreakScore() < 2 || getEngineScore() < 3) ? true : false;
        return broken;
    }

    // GETTERS AND SETTERS

    public String getMake(){
        return make;
    };

    public void setMake(String make){
        this.make = make;
    };

    public String getModel(){
        return model;
    };

    public void setModel(String model){
        this.model = model;
    };

    public Integer getAge(){
        return age;
    };

    public void setAge(Integer age){
        this.age = age;
    };

    public Integer getMilage(){
        return milage;
    };

    public void setMilage(Integer milage){
        this.milage = milage;
    };
    
    public Long getWheelScore(){
        return wheelScore;
    };

    public void setWheelScore(Long wheelScore){
        this.wheelScore = wheelScore;
    };

    public Long getBreakScore(){
        return breakScore;
    };

    public void setBreakScore(Long breakScore){
        this.breakScore = breakScore;
    };

    public Long getEngineScore(){
        return engineScore;
    };

    public void setEngineScore(Long engineScore){
        this.engineScore = engineScore;
    };

    public Boolean getWarningLightOn(){
        return warningLightOn;
    };

    public void setWarningLightOn(Boolean warningLightOn){
        this.warningLightOn = warningLightOn;
    };

};
