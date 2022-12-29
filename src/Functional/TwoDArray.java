package Functional;

import java.util.Scanner;
public class TwoDArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of rows of an array");
        int row = sc.nextInt();
        System.out.println("Enter the size of columns of an array");
        int col = sc.nextInt();
        int arr[] [] = new int[row] [col];
        System.out.println("Enter" +" "+( row * col)+" "+"values of 2D array");
        for (int i = 0;i<row ; i++){
            for(int j = 0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix is :");
        for (int i = 0;i< row ; i++){
            for(int j = 0;j<col;j++){
                System.out.print( arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
