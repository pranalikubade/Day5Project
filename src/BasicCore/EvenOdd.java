package BasicCore;

import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = scan.nextInt();
        if (num % 2 == 0)
            System.out.println("Even Number:" + num);
        else
            System.out.println("Odd Number:" + num);
    }
}
