package BasicCore;

import java.util.Scanner;

public class HarmonicNumber {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Number");
            int n= scan.nextInt();
            double value = 0.0;
            if(n == 0 ) {
                System.out.println("Number is not equal to zero");
            }
            System.out.println("Harmonic Series is: ");
            for (int i= n; n > 0; n--){
                value = value + (double)1/n;
                System.out.println(value+ " ");
            }
            System.out.println("Output of Harmonic Series: " +value);

    }
}
