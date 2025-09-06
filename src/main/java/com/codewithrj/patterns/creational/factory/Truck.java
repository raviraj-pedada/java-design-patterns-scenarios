package com.codewithrj.patterns.creational.factory;

public class Truck implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delivered through Truck");
    }
}
