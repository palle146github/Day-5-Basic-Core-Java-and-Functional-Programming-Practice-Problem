package Functionalprograms;

import java.util.Scanner;

public class Windchill {
    public static void main(String[] args) {
        double t, v;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the temperature ==> ");
        t = s.nextDouble();
        System.out.println("Enter the wind speed ==> ");
        v = s.nextDouble();
        double effectiveTemperature;
        if (Math.abs(t) <= 50 || (v > 3 || v < 120)) {
            effectiveTemperature = 35.74 + 0.6215 * t + (0.4257 * t - 35.75) * Math.pow(v, 0.16);
            System.out.println("Effective Temperature is ==> " + effectiveTemperature );
        }
    }
}
