package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Circle Radius: ");
        double radius = input.nextDouble();
        //double area = (radius * radius * 3.14);

        System.out.println(Circle.getArea(radius));
        input.close();
    }
}
