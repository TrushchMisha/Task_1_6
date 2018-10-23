package com.tm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] s = scanner.nextLine().split(" ");
        double a = Double.parseDouble(s[0]);
        double b = Double.parseDouble(s[1]);
        double c = Double.parseDouble(s[2]);

        double D = Math.pow(b, 2) - 4 * a * c;
        if(D < 0) {
            System.out.println("No solutions");
        }
        else if(D == 0) {
            double x = b * -1 / 2 / a;
            System.out.println(x);
        }
        else{
            double x1 = (b * -1 - D) / 2 / a;
            System.out.println(x1);
            double x2 = (b * -1 + D) / 2 / a;
            System.out.println(x2);
        }
    }
}
