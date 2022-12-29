package BasicCore;

public class Powerof2 {
    public static void main(String[] args) {

        int num = Integer.parseInt(args[0]);
        if ((num < 0 || num > 31)) {
            System.out.println("Enter number in between range 0 to 31 ");
        } else {
            System.out.println("2 to the Power till " + num + ":");
            for (int i = 0; i <= num; i++) {
                int power = (int) Math.pow(2, i);
                System.out.println("2^" + i + " -> " + power);
            }

        }

    }
}

