package Ch1;
//Date: 10-02-2023

//Author: Rajyavardhan Bhandari

//Ques2: Write a program to calculate CGPA using marks of three subjects (out of 100)

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of first subject");
        float a = sc.nextFloat();
        System.out.println("Enter the marks of second subject");
        float b = sc.nextFloat();
        System.out.println("Enter the marks of third subject");
        float c = sc.nextFloat();

        float cgpa = (a + b + c) / 30;

        System.out.print("The CGPA of the student is: " + cgpa);

    }
}
