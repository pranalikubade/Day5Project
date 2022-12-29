package BasicCore;

import java.util.Scanner;

public class QuotientandRemainder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Dividend");
        int d = scan.nextInt();
        System.out.println("Enter Divisor");
        int v = scan.nextInt();
        int q = d / v;
        System.out.println("Quotient :" +q);
        int r = d % v;
        System.out.println("Remainder :" +r);

    }
}
