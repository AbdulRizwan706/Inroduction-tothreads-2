// A class Client with a main method.
// Client class shall take two numbers as input from the user.
// Client class should create a new thread and invoke code in a class called Adder.
// Client class shall pass two numbers (taken as input from the user) to the Adder class.
// The Adder class should print the sum of two numbers passed to it.

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        Adder add = new Adder();
        add.num1 = x; add.num2 = y;
        ScalerThread t1 = new ScalerThread(add);
        t1.start();

    }
}
