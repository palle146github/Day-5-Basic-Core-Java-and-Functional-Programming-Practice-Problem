package Basiccoreprograms;

import java.util.Scanner;

public class Quotientandreminder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int dividend, divisor ;
        double quotient, reminder;
        System.out.println("Enter Dividend");
        dividend = s.nextInt();
        System.out.println("Enter Divisor");
        divisor = s.nextInt();
        quotient = dividend / divisor ;
        reminder = dividend % divisor ;
        System.out.println(" Quotient is ==> " + quotient );
        System.out.println(" Reminder is ==> " + reminder );

    }
}
