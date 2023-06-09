package com.sonny.java.polymorphism;

class Animal {
    
    public void animalSound() {
        System.out.println("Animals have their own sound.");
    }

}

class Pig extends Animal{
    public void animalSound() {
        System.out.println("Pig sounds: wee wee...");
    }
}

class Dog extends Animal{
    public void animalSound() {
        System.out.println("Dog barks: woou woou....");
    }
}

class Main{
    public static void main(String[] args) {
        
        Animal myAnimal = new Animal();
        
        myAnimal.animalSound();
        
        Animal myPig = new Pig();
        myPig.animalSound();
        
        Animal myDog = new Dog();
        myDog.animalSound();
    }
}
