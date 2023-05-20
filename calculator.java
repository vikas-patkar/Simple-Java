package com.company;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String d;

        do {
            System.out.println("Enter the First Number : ");
            int a = sc.nextInt();
            System.out.println("Enter the Second Number : ");
            int b = sc.nextInt();
            System.out.println("Enter 1 for Addition,\n Enter 2 for Subtraction,\n Enter 3 for Multiplication,\n Enter 4 for Division,\n Enter 5 for Modulo");
            int c = sc.nextInt();
            switch (c) {
                case (1): {
                    System.out.println("Addition is" + a + b);
                }break;
                case (2): {
                    System.out.println("Subtraction is" + (a - b));
                }break;
                case (3): {
                    System.out.println("Multiplication is" + a * b);
                }break;
                case (4): {
                    System.out.println("Division is" + a / b);
                }break;
                case (5): {
                    System.out.println("Modulo is" + a % b);
                }break;
                default:
                    System.out.println(" wrong Choice");



            }System.out.println(" Do you want to Continue");
            d = sc.next();
        }while(d.equalsIgnoreCase ("YES"));
    }

}
