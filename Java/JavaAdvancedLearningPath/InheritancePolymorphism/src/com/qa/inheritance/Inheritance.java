package com.qa.inheritance;

public class Inheritance {
    private String eyecolour;
    private String haircolour;
    private Integer heightcm;

    public Inheritance(){

    };

    public Inheritance(String eyecolour, String haircolour, Integer heightcm){
        this.eyecolour = eyecolour;
        this.haircolour = haircolour;
        this.heightcm = heightcm;
    }

    public String eyecolour(String eyecolour){
        String childEyecolour = "";
        switch(eyecolour){
        case "brown": 
        if (Math.random() >= 0.2){
            childEyecolour = "brown";
            } else {
                if (Math.random() >=0.5) {
                childEyecolour = "blue";
                } else {
                    childEyecolour = "hazel";
                }
            }
        case "blue":
        if (Math.random()>=0.5) {
            childEyecolour = "blue";
            } else {
            if (Math.random() >=0.5) {
                childEyecolour = "hazel";
                } else {
                childEyecolour = "brown";
                }
            }
        case "green":
        if (Math.random() >=0.8) {
            childEyecolour = "green";
            } else {
            if (Math.random() >= 0.4) {
                childEyecolour = "hazel";
                } else {
                childEyecolour = "blue";
                }
            }
        }
        return childEyecolour;
    }

    public String getEyecolour(){
        return eyecolour;
    }

    public String getHaircolour(){
        return haircolour;
    }

    public Integer getHeightCM(){
        return heightcm;
    }

    public void setEyecolour(String eyecolour){
        this.eyecolour = eyecolour;
    }

    public void setHaircolour(String haircolour){
        this.haircolour = haircolour;
    }

    public void setHeightCM(Integer heightcm){
        this.heightcm = heightcm;
    }

}
