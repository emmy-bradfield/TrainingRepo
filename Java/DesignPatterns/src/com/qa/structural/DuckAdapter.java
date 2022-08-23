package com.qa.structural;

public class DuckAdapter extends WildTurkey{
    Mallard mallard;

    public DuckAdapter(Mallard mallard){
        this.mallard = mallard;
    }
    
    @Override
    public void gobble() {
        System.out.println("wak");
    }

    @Override
    public void fly() {
        System.out.println("i am doing a fly, i am");
    }
}
