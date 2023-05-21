package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class doWhileLoop {
    public static void main(String[] args) {
//        int i = 2 ;
//        do{
//            System.out.println(i);
//            i = i+2;
//        }while(i <= 100);
//    }

        Scanner sc = new Scanner(System.in);
        String c;

        do {
            System.out.println("Enter Two  numbers");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);
            System.out.println("do you want to continue");
             c = sc.next();
        }while(c.equalsIgnoreCase ("YES"));



    }
}
