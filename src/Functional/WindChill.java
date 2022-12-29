package Functional;

public class WindChill {
    public static void main(String[] args) {

        double t = Double.parseDouble(args[0]);
        if (t>50)
            System.out.println("Enter value for temperature till 50");
        double v = Double.parseDouble(args[1]);
        if (v<3 || v>120)
            System.out.println("Enter value for wind speed in between 3 to 120 ");
        else {
            double windchill = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
            System.out.println("windchill = " + windchill);
        }
    }
}
