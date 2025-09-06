package com.codewithrj.patterns.creational.factory;

public class Ship implements Transport{

    @Override
    public void deliver() {
        System.out.println("Delivered through Ship");
    }
}
