package Functional;

import java.util.Scanner;

public class Sumof3Integer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = scanner.nextInt();
        int array[] = new int[n];
        System.out.println("Enter values of an array : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        boolean triplet = false;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (array[i] + array[j] + array[k] == 0) {
                        System.out.println("Triplets with sum = 0 are ");
                        System.out.println(array[i] + " + " + array[j] + " + " + array[k] + " = 0");
                        triplet = true;
                    }
                }
            }
        }
        if (triplet == false)
            System.out.println("Triplets with sum = 0 not found");
    }


}

