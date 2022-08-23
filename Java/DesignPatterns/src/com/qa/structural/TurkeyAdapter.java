package com.qa.structural;

public class TurkeyAdapter extends Mallard{
    WildTurkey turkey;

    public TurkeyAdapter(WildTurkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        System.out.println("gobblé");
    }

    @Override
    public void fly() {
        System.out.println("i am doing a sm0l fly, because i'm bige");
    }
    
}
