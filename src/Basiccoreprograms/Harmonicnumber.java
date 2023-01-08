package Basiccoreprograms;

import java.util.Scanner;

public class Harmonicnumber {
    public static void main(String[] args) {
        double harmonicNumber = 0;
        double harmonicValue ;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Haramonic  ");
        harmonicValue = s.nextInt();
        if ( harmonicValue != 0){
            for ( int i = 1; i <= harmonicValue; i++){
                harmonicNumber = harmonicNumber + ( 1.0 / i  );
            }
            System.out.println("Nth Harmonic Number ==> " + harmonicNumber);
        }
        else{
            System.out.println("Enter valid input");
        }
    }

}
