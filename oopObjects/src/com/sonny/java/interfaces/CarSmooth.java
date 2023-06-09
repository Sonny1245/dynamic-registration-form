package com.sonny.java.interfaces;

interface  CarSmooth {
    
    public void breaking();
    public void run();

}

class Car implements CarSmooth{

    @Override
    public void breaking() {
        System.out.println("Ford Mustang breaks very smooth.");
        
    }

    @Override
    public void run() {
        System.out.println("Ford Car is running very reliable...");
        
    }
    
}

 class MainTest{
    public static void main(String[] args) {
        
        Car myCar = new Car();
        myCar.breaking();
        myCar.run();
        
    }
}
