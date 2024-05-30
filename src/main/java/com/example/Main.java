package com.example;
public class Main {
  public static void main(String[] args) {
    Car c1=new Car();
    c1.carBrand="tata";
    c1.noOfGears=5;
    System.out.println("no of gears: "+c1.noOfGears);
    System.out.println("brand name: "+c1.carBrand);
    greet();
  }
  public static void greet(){
    System.out.println("hello good morning");
  }
}
