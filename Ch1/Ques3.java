package Ch1;
//Date: 10-02-2023

//Author: Rajyavardhan Bhandari

//Ques3: Write a Java program that asks the user to enter his/her name and greets them with “Hello <name>, have a good day” text.

import java.util.Scanner;

public class Ques3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("Hello " + name + ", have a good day");

    }

}
