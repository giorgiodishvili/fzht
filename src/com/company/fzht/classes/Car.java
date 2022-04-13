package com.company.fzht.classes;

public class Car {
    // an attribute/fields of the class. (variables)
    // fields can also have access modifiers and works the same way...
    // you can freely change value of this variables from outside or this values will be set...
    double weight = 5;
    String color = "Green";
    double fuel = 50;
    // if you dont want it to be changed by anyone ever you can define `final` in front
    final int year = 2201;

    // static means that it does not belong to each object and is shared in the class
    // the way you call it is Car.brand and not car1.brand or car2.brand as it is same for everyone
    static String brand = "BMW";

    // methods
    public void drive() {
        fuel -= 10;
        System.out.println(color + " car has started moving");
    }

    protected void stop() {
        System.out.println(color + " car has stopped");
    }

    private void accelerate() {
        System.out.println(color + " car is accelerating");
    }
}
