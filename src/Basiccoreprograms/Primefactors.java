package Basiccoreprograms;

import java.util.Scanner;

public class Primefactors {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any positive number==> ");
        int number = s.nextInt();
        int i = 2;
        System.out.println(" Prime factors are ==> ");
        while( number > 1){
            if ( number % i == 0){
                System.out.print(" " + i);
                number = number / i;
            }
            else{
                i = i + 1 ;
            }

        }

    }
}
