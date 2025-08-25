package com.codewithrj.patterns.creational.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrototypeTest {

    @Test
    void testBasicPrototype() {
        RecordPrototype original = new RecordPrototype("Annual Report", new Author("Tom"));
        RecordPrototype clone = original.copy();

        // Check object references - As new objects are created these references should not be same.
        assertNotSame(original, clone);

        // Basic prototype shares nested object (Author) - as we did custom shallow copy implementation in the  Basic Prototype. Both should be same
        assertSame(original.getAuthor(), clone.getAuthor());

        // Changing nested object affects both
        clone.getAuthor().setName("Tim");
        assertEquals("Tim", original.getAuthor().getName());
    }

    @Test
    void testShallowCopy() {
        RecordPrototypeShallowCopy original = new RecordPrototypeShallowCopy("Quarterly Report", new Author("Raj"));
        RecordPrototypeShallowCopy clone = original.clone();

        // Objects are different - As new objects are created these references should not be same.
        assertNotSame(original, clone);

        // Nested object is shared
        assertSame(original.getAuthor(), clone.getAuthor());

        clone.getAuthor().setName("Ram");
        assertEquals("Ram", original.getAuthor().getName());
    }

    @Test
    void testDeepCopy() {
        RecordPrototypeDeepCopy original = new RecordPrototypeDeepCopy("Quarterly Report", new Author("David"));
        RecordPrototypeDeepCopy clone = original.clone();

        // Objects are different
        assertNotSame(original, clone);

        // Nested object is independent - as we did a deep copy implementation these objects should be different
        assertNotSame(original.getAuthor(), clone.getAuthor());

        // Changing clone's author does not affect original
        clone.getAuthor().setName("Matthew");
        assertEquals("David", original.getAuthor().getName());
        assertEquals("Matthew", clone.getAuthor().getName());
    }

    @Test
    void testRegistryPrototype() {
        RecordPrototypeRegistry registry = new RecordPrototypeRegistry();
        RecordPrototype original = registry.getRecord("Research Paper");
        RecordPrototype clone = registry.getRecord("Research Paper");

        assertNotSame(original, clone);
        assertSame(original.getAuthor(), clone.getAuthor()); // here we used the basic prototype implementation with a shallow copy.

        // Optional: show behavior of nested object mutation
        clone.getAuthor().setName("Ankit");
        assertEquals("Ankit", original.getAuthor().getName());
    }
}
