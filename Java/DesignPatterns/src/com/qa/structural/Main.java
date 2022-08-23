package com.qa.structural;

public class Main {
    public static void main(String[] args){
    Mallard mallard = new Mallard();
    WildTurkey wildTurkey = new WildTurkey();
    wildTurkey.gobble();
    mallard.quack();
    wildTurkey.fly();
    mallard.fly();

    DuckAdapter secretDuck = new DuckAdapter(mallard);
    secretDuck.gobble();
    secretDuck.fly();

    TurkeyAdapter secretTurkey = new TurkeyAdapter(wildTurkey);
    secretTurkey.quack();
    secretTurkey.fly();

    }
}
