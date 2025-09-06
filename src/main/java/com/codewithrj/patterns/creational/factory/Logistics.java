package com.codewithrj.patterns.creational.factory;

public abstract class Logistics {
    protected abstract Transport createTransport();

    public void planDelivery(){
        Transport transport = createTransport();
        transport.deliver();
    }
}
