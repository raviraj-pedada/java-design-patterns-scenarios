package com.codewithrj.patterns.creational.singleton;

public class DatabaseConnectionLazy {
    private static DatabaseConnectionLazy instance;

    private DatabaseConnectionLazy(){
        System.out.println("Creating a new DB Connection in Lazy Approach");
    }

    public static DatabaseConnectionLazy getInstance(){
        if(instance == null){
            instance = new DatabaseConnectionLazy();
        }
        return instance;
    }
}
