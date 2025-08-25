package com.codewithrj.patterns.creational.singleton;

public class SingletonApp {
    public static void main(String[] args){

        System.out.println("\n--- Lazy Approach ---");
        DatabaseConnectionLazy databaseConnectionLazy1 = DatabaseConnectionLazy.getInstance();
        DatabaseConnectionLazy databaseConnectionLazy2 = DatabaseConnectionLazy.getInstance();

        System.out.println("\n--- Eager Approach ---");
        DatabaseConnectionEager databaseConnectionEager1 = DatabaseConnectionEager.getInstance();
        DatabaseConnectionEager databaseConnectionEager2 = DatabaseConnectionEager.getInstance();

        System.out.println("\n--- Thread Safe Approach ---");
        DatabaseConnectionThreadSafe databaseConnectionThreadSafe1 = DatabaseConnectionThreadSafe.getInstance();
        DatabaseConnectionThreadSafe databaseConnectionThreadSafe2 = DatabaseConnectionThreadSafe.getInstance();

        System.out.println("\n--- Double Checked Locking Approach ---");
        DatabaseConnectionDoubleCheckedLocking databaseConnectionDoubleCheckedLocking1 = DatabaseConnectionDoubleCheckedLocking.getInstance();
        DatabaseConnectionDoubleCheckedLocking databaseConnectionDoubleCheckedLocking2 = DatabaseConnectionDoubleCheckedLocking.getInstance();

        System.out.println("\n--- Enum ---");
        DatabaseConnectionEnum databaseConnectionEnum1 = DatabaseConnectionEnum.INSTANCE;
        DatabaseConnectionEnum databaseConnectionEnum2 = DatabaseConnectionEnum.INSTANCE;



        System.out.println("\nCheck if instances are same:");
        System.out.println("Lazy: " + (databaseConnectionLazy1 == databaseConnectionLazy2));
        System.out.println("ThreadSafe: " + (databaseConnectionThreadSafe1 == databaseConnectionThreadSafe2));
        System.out.println("DoubleChecked: " + (databaseConnectionDoubleCheckedLocking1 == databaseConnectionDoubleCheckedLocking2));
        System.out.println("Eager: " + (databaseConnectionEager1 == databaseConnectionEager2));
        System.out.println("Enum: " + (databaseConnectionEnum1 == databaseConnectionEnum2));
    }
}
