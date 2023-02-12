package Ch1;
//Date: 10-02-2023

//Author: Rajyavardhan Bhandari

//Ques4: Write a Java program to convert Kilometers to miles.

import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {

        System.out.println("Converting Kilometer(s) into mile(s)");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in Kilometer");
        float km = sc.nextFloat();

        float miles = (float) (0.6213711922 * km);
        System.out.println("So the distance in miles is: " + miles);

    }
}
