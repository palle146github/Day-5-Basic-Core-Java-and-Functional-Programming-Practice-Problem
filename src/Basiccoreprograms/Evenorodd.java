package Basiccoreprograms;

import java.util.Scanner;

public class Evenorodd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        if( number % 2 ==0 ){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
}
