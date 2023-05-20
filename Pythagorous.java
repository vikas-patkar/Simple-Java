package com.company;
import java.util.Scanner;
public class Pythagorous {

    public static void main(String[] args) {
	// write a program to calculate hypotenious using pythagouss theorem
        Scanner sc = new Scanner(System.in);  // creating an object of Scanner Class
        System.out.println("Enter the length of Perpendicular ");
        int p = sc.nextInt();
        System.out.println("Enter the length of Base");
        int b = sc.nextInt();
        double h = Math.pow(p,2) + Math.pow(b,2);
        double a = Math.sqrt(h);
        System.out.println("the hypotenious will be \n" + a);

    }
}
