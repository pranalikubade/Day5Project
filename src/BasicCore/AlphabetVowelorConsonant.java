package BasicCore;

import java.util.Scanner;

public class AlphabetVowelorConsonant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Alphabet");
        char ch = scan.next().charAt(0);
        switch (ch){
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
                System.out.println(ch+ " is vowel");
                break;
            default:
                System.out.println(ch+ " is consonent");

        }
    }
}
