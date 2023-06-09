package com.sonny.java.abstraction;

abstract class Animal {
    
    public abstract void bark();
    
    public void sleep() {
        System.out.println("Animals are sleeping too much.");
    }

}

class Dog extends Animal{
    
    public void bark() {
        System.out.println("Dogs are barking at night a lots...");
    }
}


