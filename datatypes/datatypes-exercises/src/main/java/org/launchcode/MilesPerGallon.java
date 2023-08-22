package org.launchcode;

import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the miles driven:");
        double miles = input.nextDouble();
        System.out.println("Enter the amount of gas consume in gallons:");
        double gallons = input.nextDouble();
        double mpg = miles/gallons;
        System.out.println("Your vehicle is getting " + mpg + " miles-per-gallon");
    }
}
