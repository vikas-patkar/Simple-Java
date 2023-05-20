package com.company;
import java.util.Scanner;
public class PrintEven {
    public static void main(String[] args) {
        // while loop
        // print all the even numbers from 1 to 100
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to Which i have to print even numbers : ");
        int n = sc.nextInt();
        int i =2;
        while (i <=n){
            System.out.println(i);
            i = i+2;
        }
    }
}
