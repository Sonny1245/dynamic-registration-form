package com.sonny.java.inheritance;

//Inheritance: subclass and superclass: keyword: extends
//Use protected attribute for superclass
//subclass = Car, superclass = Vehicle

 class Vehicle {
     protected String brandName="Ford";
     
     public void myMethod() {
         System.out.println("My car is running excellent!");
     }

}
 
 class Car extends Vehicle{
     private String carName = "Mustang";
     
     public static void main(String[] args) {
         Car myCar = new Car();
         myCar.myMethod();
         
         System.out.println(myCar.brandName + " " + myCar.carName);
     }
 }
