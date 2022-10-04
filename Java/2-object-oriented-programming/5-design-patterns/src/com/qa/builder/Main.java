package com.qa.builder;

import com.qa.builder.BankAccount.Builder;

public class Main {
    public static void main(String[] args){
        Builder build = new Builder(000001L);
        build.build();
    }
}
