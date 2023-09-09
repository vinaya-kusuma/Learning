package com.MethodReferencesExamples;

@FunctionalInterface
public interface PersonFactory {

    public Person create(int id, String name);
}
