package com.codewithrj.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class SingletonTest {

    @Test
    void lazySingleTon(){
        DatabaseConnectionLazy instance1 = DatabaseConnectionLazy.getInstance();
        DatabaseConnectionLazy instance2 = DatabaseConnectionLazy.getInstance();
        assertSame(instance1,instance2, "Lazy Singleton instances should be the same");
    }


    @Test
    void testThreadSafeSingleton() {
        DatabaseConnectionThreadSafe instance1 = DatabaseConnectionThreadSafe.getInstance();
        DatabaseConnectionThreadSafe instance2 = DatabaseConnectionThreadSafe.getInstance();
        assertSame(instance1, instance2, "Thread-safe Singleton instances should be the same");
    }

    @Test
    void testDoubleCheckedSingleton() {
        DatabaseConnectionDoubleCheckedLocking instance1 = DatabaseConnectionDoubleCheckedLocking.getInstance();
        DatabaseConnectionDoubleCheckedLocking instance2 = DatabaseConnectionDoubleCheckedLocking.getInstance();
        assertSame(instance1, instance2, "Double-checked Singleton instances should be the same");
    }

    @Test
    void testEagerSingleton() {
        DatabaseConnectionEager instance1 = DatabaseConnectionEager.getInstance();
        DatabaseConnectionEager instance2 = DatabaseConnectionEager.getInstance();
        assertSame(instance1, instance2, "Eager Singleton instances should be the same");
    }

    @Test
    void testEnumSingleton() {
        DatabaseConnectionEnum instance1 = DatabaseConnectionEnum.INSTANCE;
        DatabaseConnectionEnum instance2 = DatabaseConnectionEnum.INSTANCE;
        assertSame(instance1, instance2, "Enum Singleton instances should be the same");
    }

}
