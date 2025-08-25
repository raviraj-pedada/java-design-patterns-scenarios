package com.codewithrj.patterns.creational.singleton;

public enum DatabaseConnectionEnum {
    INSTANCE;

    DatabaseConnectionEnum(){
        System.out.println("Creating DatabaseConnectionEnum Enum instance");
    }
}
