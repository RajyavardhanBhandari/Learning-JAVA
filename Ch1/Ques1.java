package Ch1;
//Date: 15-01-2023
//Author: Rajyavardhan Bhandari

//Ques1: Write a program to sum three numbers in Java. 

import java.util.Scanner;

    public class Ques1 {
        public static void main (String[] args){
            Scanner sc = new Scanner(System.in); //system.in==>read from Keyboard

            System.out.println("Enter first number");
            int a = sc.nextInt();
            System.out.println("Enter second number");
            int b = sc.nextInt();
            System.out.println("Enter third number");
            int c = sc.nextInt();

            int sum = a+b+c;
            
            System.out.print("The Sum of the three numbers is: "+ sum);
            
        }
    }