package com.codewithrj.patterns.creational.factory;

public class FactoryApplication {
    public static void main(String[] args){
        Logistics roadLogistics = new RoadLogistics();
        roadLogistics.planDelivery();

        Logistics seaLogistics = new SeaLogistics();
        seaLogistics.planDelivery();
    }
}
