package com.company.fzht.method;

public class MainRec {
    public static void main(String[] args) {
        System.out.println(fibonacciRec(10));
    }

    public static void print(int iterations) {
        if (iterations == 0) {
            return;
        }
        System.out.println("HelloWorld iteration: " + iterations);
        iterations--;
        print(iterations);
    }

    public static void game() {
        //....
//
//        System.out.println("would you play again");
//        if (yes) {
//            game();
//        } else {
//            return;
//        }
//
    }

    public static void fibonnaci(int count) {
        int n1 = 0, n2 = 1, n3;
        System.out.print(n1 + " " + n2);//printing 0 and 1
        // count = 10
        // 0, 1
        // i = 2 , 0, 1, 1
        // i = 3  0, 1, 1, 2
        // i = 4  0, 1, 1, 2, 3
        // i = 5  0, 1, 1, 2, 3, 5
        // i = 5  0, 1, 1, 2, 3, 5, 8
        for (int i = 2; i < count; ++i) {
            // i = 2, n1 = 0, n2 = 1, n3 = 0
            // i = 3, n1 = 1, n2 = 1, n3 = 1
            // i = 4, n1 = 1, n2 = 2, n3 = 2
            // i = 5, n1 = 2, n2 = 3, n3 = 3
            // i = 6, n1 = 3, n2 = 5, n3 = 5
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
            // i = 2, n1 = 1, n2 = 1, n3 = 1
            // i = 3, n1 = 1, n2 = 2, n3 = 2
            // i = 4, n3 = 3, n1 = 2, n2 = 3
            // i = 5, n3 = 5, n1 = 3, n2 = 5
            // i = 6, n3 = 8, n1 = 5, n2 = 8
        }
    }

    static int fibonacciRec(int n) {
        // n = 10
        if (n <= 1)
            return n;
        return fibonacciRec(n - 1) + fibonacciRec(n - 2);
    }

    // fibonacci n = 9 + fibonacci n = 8 // i = 10
    // fibonacci n = 8 + fibonacci n = 7 // i = 9
    // fibonacci n = 7 + fibonnaci n = 6 // i = 8
    // fibonacci n = 6 + fibonnaci n = 5 // i = 7
    // fibonacci n = 5 + fibonnaci n = 4 // i = 6 =
    // fibonacci n = 3 + fibonnaci n = 2 // 1 + 2 = 3
    // fibonacci n = 2 + fibonnaci n = 1 // 1 + 1 = 2
    // fibonnacci n = 2 // 1+ 0 // 1
    // fibbonacci n = 1 // n = 1

}


class rekursion {
    public static int potenz(int x, int y) {
        int z;
        if (y == 0) {
            return 1;

        } else {
            z = potenz(x, y - 1);
            return x * z;
        }
    }

    public static void main(String[] args) {
        System.out.println( potenz(10,10));
    }
}