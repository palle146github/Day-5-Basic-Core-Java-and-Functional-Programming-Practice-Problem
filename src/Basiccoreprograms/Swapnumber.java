package Basiccoreprograms;

import java.util.Scanner;

public class Swapnumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b ;
        System.out.println("Enter a value ==> ");
        a = s.nextInt();//10
        System.out.println("Enter b value ==> ");
        b = s.nextInt();//5
        System.out.println("a, b values before swap "+ a +","+ b );
        a = a * b;//5
        b = a / b;//5
        a = a / b;//5
        System.out.println("a, b values after swap "+ a +","+ b );


    }
}
