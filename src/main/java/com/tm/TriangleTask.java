package com.tm;

import java.util.Scanner;

public class TriangleTask {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String[] d = in.nextLine().split(" ");
        double a = Double.parseDouble(d[0]);
        double b = Double.parseDouble(d[1]);
        double c = Double.parseDouble(d[2]);

        if(a > b + c || b > a + c || c > a + b) {
            System.out.println("Impossible triangle");
        } else {
            if(a == b && b == c) {
                System.out.println("Равносторонний треугольник");
            } else if(a == b || b == c || a == c) {
                System.out.println("Равнобедренный треугольник");
            }
            System.out.println("Углы: ");
            double a1 = Math.round(Math.toDegrees(Math.acos((Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c))));
            System.out.println(a1);
            double a2 = Math.round(Math.toDegrees(Math.acos((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c))));
            System.out.println(a2);
            double a3 = 180 - a1 - a2;
            System.out.println(a3);
            if(a1 == 90 || a2 == 90 || a3 == 90) {
                System.out.println("Прямоугольный треугольник");
            }
        }
    }
}
