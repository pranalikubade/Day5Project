package Functional;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {

        Scanner scan = new Scanner( System.in);
        System.out.println("Enter value of a");
        double a = scan.nextDouble();
        System.out.println("Enter value of b");
        double b = scan.nextDouble();
        System.out.println("Enter value of c");
        double c = scan.nextDouble();

        double delta = b*b - 4*a*c;
        double root1,root2;
        if (delta > 0) {
            System.out.println("The root of the equation are real and different");
            root1 = (-b + Math.sqrt(delta)) / (2*a);
            root2 = (-b - Math.sqrt(delta))/ (2*a);
            System.out.println("root1 = "+root1+   "and root2 = "+root2);
        } else if (delta == 0) {
            System.out.println("The root of the equation are real and same");
            root1 = root2 = -b/ (2*a);
            System.out.println("root1 = root2 = "+root1);
        }else {
            System.out.println("The root of the equation are complex and different");
        }

    }
}
