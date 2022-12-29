package BasicCore;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        int number1,number2,swap;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number1 :");
        number1 = sc.nextInt();
        System.out.println("Enter a number2 :");
        number2 = sc.nextInt();
        swap = number1;
        number1 = number2;
        number2 = swap;
        System.out.println("After swapping number1 : " +number1);
        System.out.println("After swapping number2 : " +number2);
    }

}
