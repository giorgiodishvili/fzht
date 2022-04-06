package com.company.fzht.method;

import com.company.fzht.classes.Car;

public class Main {
    public static void main(String[] args) {
        printName("Mari");
        double perimeter = squarePerimeter(5D);
        System.out.println(perimeter);
        helloWorld();

//        Car car = new Car();
//        car.drive();
    }

    /**
     * A method is a block of code which only runs when it is called.
     * You can pass data, known as parameters, into a method.
     * Methods are used to perform certain actions, and they are also known as functions.
     * Why use methods? To reuse code: define the code once, and use it many times.
     */

    /**
     * what does package mean ?
     * A package in Java is used to group related classes. Think of it as a folder in a file directory.
     * We use packages to avoid name conflicts, and to write a better maintainable code.
     * for example we are in com/company/fzht/method directory now
     */

    /**
     method is constructed by
     1. access modifier which can be public/protected/private/default
     2. return type can be any Object/primitive type/ void (returns nothing)
     3. name of the function (camelCase)
     4. parameters in () or it can have no parameters at all as well
     */

    /**
     access modifier means from which place it can be through the program
     1. public -> everywhere in a whole project
     2. private -> in the class where it is defined only
     3. protected ->  the class itself, same package and its subclasses (its subclasses can see it in other package as well)
     4. default (when you dont write anything it has default modifier ) -> the class itself, throughout the package, subclasses(subclasses cant access/see it)
     */

    public static void printName(String name) {
        System.out.println("My name is " + name);
    }

    public static double squarePerimeter(double sideLength) {
        return sideLength * 4;
    }

    public static void helloWorld() {
        System.out.println("GelloWorld");
    }

    /**
     * write a function which gets two side of rectangle and calculates area (fartobi)
     * @Parameter double side1
     * @Parameter double side2
     * @Returns double area
     */
    // write here

    /**
     * write a function which gets two integers and prints the one that is larger
     * @Parameter int a
     * @Parameter int b
     * @Returns nothing (void)
     */
    // write here

    /**
     * Write a method to compute the average of three numbers (decide the type yourself)
     * @Parameter a
     * @Parameter b
     * @Parameter c
     * @Returns average (decide the type yourself)
     */
    // write here

    /**
     * Write a method to count all vowels(xmovnebi) in a string
     * @Parameter String sentence
     * @Returns int amount of vowels in a sentence
     */
    // write here

}
