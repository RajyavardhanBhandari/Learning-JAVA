package Ch1;
//Date: 11-02-2023

//Author: Rajyavardhan Bhandari

//Ques5: Write a Java program to detect whether a number entered by the user is an integer or not.

import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        System.out.println("Detecting whether a number entered by the user is an integer or not");
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the Data: ");
        System.out.println(sc.hasNextInt());
    }
}
