package Basiccoreprograms;
import java.util.Scanner;
public class Poweroftwo {
    public static void main(String[] args) {
        int powerOftwo = 1 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of power");
        int powerValue = sc.nextInt();
        sc.close();
        if(powerValue > 0 && powerValue < 31) {
            for(int i = 1 ; i <= powerValue; i++) {
                    powerOftwo = powerOftwo * 2 ;
                System.out.println("Power value of 2 at PowerValue " + i + "\t" + powerOftwo);
            }
        }
        else {
            System.out.println("Enter the some other powervalue");
            System.out.println("Power value  " + "\t" + powerOftwo);

        }

    }
    }

