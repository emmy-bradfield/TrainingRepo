package com.qa.inheritance;

public class Inherited extends Inheritance {
    private String childEyecolour;
    private String childHaircolour;
    private Integer childHeight;
    private String name;

    public Inherited(){
        };

    public Inherited(String name, Inheritance parent){
        this.name = name;
        this.childEyecolour = getEyesFrom(parent);
        this.childHaircolour = getHairFrom(parent);
        this.childHeight = getHeightFrom(parent);
    }

    public String getEyesFrom(Inheritance parent){
        this.childEyecolour = eyecolour(parent.getEyecolour());
        return childEyecolour;
    }

    public String getHairFrom(Inheritance parent){
        if (parent.getHaircolour() == "brown") {
            this.childHaircolour = "brown";
        } else if (parent.getHaircolour() == "blonde"){
            if (Math.random() >=0.7) {
                this.childHaircolour = "blonde";
            } else {
                this.childHaircolour = "brown";
            }
        } else if (parent.getHaircolour() == "ginger") {
            if (Math.random() >=0.9) {
                this.childHaircolour = "ginger";
            } else if (Math.random() >=0.6) {
                this.childHaircolour = "blonde";
            } else {
                this.childHaircolour = "brown";
            }
        } else {
            this.childHaircolour = "brown";
        }
        return childHaircolour;
    }
  
    public Integer getHeightFrom(Inheritance parent){
        this.childHeight = parent.getHeightCM() - 50;
        return childHeight;
    }

    public String getName(){
        return name;
    }

    public String getChildHair(){
        return childHaircolour;
    }

    public String getChildEyes(){
        return childEyecolour;
    }

    public Integer getChildHeight(){
        return childHeight;
    }

}
