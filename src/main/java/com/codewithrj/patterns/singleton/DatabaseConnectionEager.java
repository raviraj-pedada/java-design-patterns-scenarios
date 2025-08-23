package com.codewithrj.patterns.singleton;

public class DatabaseConnectionEager {

    private static DatabaseConnectionEager instance= new DatabaseConnectionEager();

    private DatabaseConnectionEager(){
        System.out.println("Creating a new DB connection in Eager Approach");
    }

    public static DatabaseConnectionEager getInstance(){
        return instance;
    }
}
