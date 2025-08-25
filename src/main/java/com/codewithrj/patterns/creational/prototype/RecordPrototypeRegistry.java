package com.codewithrj.patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class RecordPrototypeRegistry {

    private static Map<String, RecordPrototype> registry = new HashMap<>();

    static {
        registry.put("Research Paper", new RecordPrototype("Data Structures",new Author("Ravi")));
        registry.put("Record", new RecordPrototype("Design Patterns",new Author("Raj")));
    }

    public RecordPrototype getRecord(String key){
        RecordPrototype recordPrototype = registry.get(key);
            if(recordPrototype != null){
                return recordPrototype.copy();
            }
        throw new IllegalArgumentException("Unknown Record Type");
    }
}
