package com.company;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find its factorial");
        int n = sc.nextInt();
        int f =1;
            while(n>1){

                f= f*n;
                n--;

            }
            System.out.println("Factorial is "+f);
        }

    }

