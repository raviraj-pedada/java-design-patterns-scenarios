package com.codewithrj.patterns.singleton;

public enum DatabaseConnectionEnum {
    INSTANCE;

    private DatabaseConnectionEnum(){
        System.out.println("Creating DatabaseConnectionEnum Enum instance");
    }
}
