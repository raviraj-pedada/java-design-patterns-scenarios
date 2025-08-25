package com.codewithrj.patterns.creational.singleton;

public class DatabaseConnectionThreadSafe {
    private static DatabaseConnectionThreadSafe instance;
    private DatabaseConnectionThreadSafe(){
        System.out.println("Creating a new DB connection in Thread Safe Approach");
    }

    public static synchronized DatabaseConnectionThreadSafe getInstance(){
        if(instance == null){
            instance = new DatabaseConnectionThreadSafe();
        }
        return instance;
    }
}
