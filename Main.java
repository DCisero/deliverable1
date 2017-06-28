package com.company;
import java.util.Scanner;

class JavaLaunchHelper {

    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        int n = 153; // 153 = (1*1*1)+(3*3*3)+(5*5*5)
        int temp = n; // set to n to preserve the value of 153
        int r, sum = 0;

        while (n > 0) {
            r = n % 10; // % is utilized to get the remainder of 3
            n = n / 10; // cancels out the 3 remainder
            sum = sum + (r * r * r); //calculate the total
        }
        //request user input of an integer
        System.out.println("Please enter a positive integer: ");
        //prompted error message for user entered non numeric values
        while (!scanner.hasNextInt()) {
            System.out.println("Expected integer value, please try again!");
            scanner.next();
        }
        n = scanner.nextInt();
        if (n == sum)
            System.out.println("True"); // printed when the integer passes the test
        else
            System.out.println("False"); // printed when the integer fails the test

    }
}

        






