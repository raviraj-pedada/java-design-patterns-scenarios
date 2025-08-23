package com.codewithrj.patterns.singleton;

public class DatabaseConnectionDoubleCheckedLocking {
    private static DatabaseConnectionDoubleCheckedLocking instance;

    private DatabaseConnectionDoubleCheckedLocking(){
        System.out.println("Creating a new DB connection Double Checked Locking Approach");
    }

    public static DatabaseConnectionDoubleCheckedLocking getInstance(){
        if(instance == null){
            synchronized (DatabaseConnectionDoubleCheckedLocking.class){
                if (instance == null){
                    instance = new DatabaseConnectionDoubleCheckedLocking();
                }
            }
        }
        return instance;
    }
}
