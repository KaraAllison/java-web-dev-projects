package org.launchcode;

import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;
        while (true) {
            System.out.println("Enter a radius:");
            try {
                radius = input.nextDouble();
            } catch(Exception e) {
                input.nextLine();
                continue;
            }
            if (radius > 0) {
                break;
            }
        }
        System.out.println("The area of a circle of radius "
        + radius + " is: " + Circle.getArea(radius));
    }
}
