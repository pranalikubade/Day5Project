package BasicCore;

import java.util.Scanner;

public class LargestamongThree {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1 :");
        num1 = sc.nextInt();
        System.out.println("Enter number2 :");
        num2 = sc.nextInt();
        System.out.println("Enter number3 :");
        num3 = sc.nextInt();
        if ((num1 > num2) && (num1 > num3))
        System.out.println (num1 + " is the greatest number");
        else if (num2 > num1 && num2 > num3)
            System.out.println (num2 + " is the greatest number");
        else
            System.out.println (num3 + " is the greatest number");
    }
}
