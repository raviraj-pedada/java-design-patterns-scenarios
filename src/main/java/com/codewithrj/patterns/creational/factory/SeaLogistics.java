package com.codewithrj.patterns.creational.factory;

public class SeaLogistics extends Logistics{
    @Override
    protected Transport createTransport() {
        return new Ship();
    }
}
