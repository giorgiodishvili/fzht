package com.company.fzht.classes;

public class Main {
    /**
        OOP stands for Object-Oriented Programming.

        Procedural programming is about writing procedures or methods that perform operations on the data, while object-oriented programming
        is about creating objects that contain both data and methods.

        Object-oriented programming has several advantages over procedural programming:

        OOP is faster and easier to execute
        OOP provides a clear structure for the programs
        OOP helps to keep the Java code DRY "Don't Repeat Yourself", and makes the code easier to maintain, modify and debug
        OOP makes it possible to create full reusable applications with less code and shorter development time
        You should extract out the codes that are common for the application, and place them at a single place and reuse them instead of repeating it.
     */

    /**
    Everything in Java is associated with classes and objects, along with its attributes and methods.
    For example: in real life, a car is an object. The car has attributes, such as weight and color, and methods, such as drive and brake.

    A Class is like an object constructor, or a "blueprint" for creating objects.
     */
    public static void main(String[] args) {
        /**
        To create an object of Car, specify the class name, followed by the object name, and use the keyword new
        */
        Car car = new Car();
        car.weight = 100;
        car.color = "BLUE";

        Car car2 = new Car();
        car2.color = "BLACK";
        car2.weight = 1000;

        //accessing variable through an object
        System.out.println(car.color);
        System.out.println(car.weight);
        car.drive();
        /**
         * can call protected method in another class in the same package (com.company.fzht.classes)
         */
        car.stop();
        /**
         * cant call private methods here
         */
//        car.accelerate();
        /**
        In one Main function you can create as much Objects as you like
        */
//        Car car2 = new Car();

//        car2.color = "BLACK";
//        car2.weight = 2000;
//        car2.drive();
//        car2.stop();
//        System.out.println(car2.color);
//        System.out.println(car2.weight);


//        car.drive();
//        car.stop();
    }
}
