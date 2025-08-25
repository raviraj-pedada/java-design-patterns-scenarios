package com.codewithrj.patterns.creational.prototype;

public class PrototypeApp {
    public static void main(String[] args){
        RecordPrototype recordPrototype = new RecordPrototype("Annual Report", new Author("Tom"));
        RecordPrototype clonedPrototype = recordPrototype.copy();


        RecordPrototypeDeepCopy recordPrototypeDeepCopy = new RecordPrototypeDeepCopy("Quarterly Report", new Author("David"));
        RecordPrototypeDeepCopy clonedRecordPrototypeDeepCopy = recordPrototypeDeepCopy.clone();

        RecordPrototypeShallowCopy recordPrototypeShallowCopy = new RecordPrototypeShallowCopy("Quarterly Report", new Author("Raj"));
        RecordPrototypeShallowCopy clonedRecordPrototypeShallowCopy = recordPrototypeShallowCopy.clone();

        RecordPrototypeRegistry recordPrototypeRegistry = new RecordPrototypeRegistry();
        RecordPrototype registryRecordPrototype = recordPrototypeRegistry.getRecord("Research Paper");
        RecordPrototype clonedRegistryRecordPrototype = registryRecordPrototype.copy();

        System.out.println("\n--- Basic Prototype Implementation ---");
        System.out.println("Before changing author:");
        System.out.println(recordPrototype.toString());
        System.out.println(clonedPrototype.toString());

        clonedPrototype.getAuthor().setName("Tim");

        System.out.println("After changing author:");
        System.out.println(recordPrototype.toString());
        System.out.println(clonedPrototype.toString());

        System.out.println("\n--- Deep Copy Prototype Implementation ---");
        System.out.println("Before changing author:");
        System.out.println(recordPrototypeDeepCopy.toString());
        System.out.println(clonedRecordPrototypeDeepCopy.toString());

        clonedRecordPrototypeDeepCopy.getAuthor().setName("Matthew");

        System.out.println("After changing author:");
        System.out.println(recordPrototypeDeepCopy.toString());
        System.out.println(clonedRecordPrototypeDeepCopy.toString());

        System.out.println("\n--- Shallow Copy ProtoType Implementation ---");
        System.out.println("Before changing author:");
        System.out.println(recordPrototypeShallowCopy.toString());
        System.out.println(clonedRecordPrototypeShallowCopy.toString());

        clonedRecordPrototypeShallowCopy.getAuthor().setName("Ram");

        System.out.println("After changing author:");
        System.out.println(recordPrototypeShallowCopy.toString());
        System.out.println(clonedRecordPrototypeShallowCopy.toString());

        System.out.println("\n--- Registry Prototype Implementation---");
        System.out.println("Before changing author:");
        System.out.println(registryRecordPrototype.toString());
        System.out.println(clonedRegistryRecordPrototype.toString());

        clonedRegistryRecordPrototype.getAuthor().setName("Ankit");

        System.out.println("After changing author:");
        System.out.println(registryRecordPrototype.toString());
        System.out.println(clonedRegistryRecordPrototype.toString());


    }
}
