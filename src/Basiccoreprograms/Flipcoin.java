package Basiccoreprograms;

import java.util.Scanner;

public class Flipcoin {
    public static void main(String[] args) {
        double numberTrails, headsorTails, head = 0, tails = 0, headPercentage, tailPercentage;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of trails");
        numberTrails = s.nextInt();
        if (numberTrails > 0) {
            for (int i = 1; i <= numberTrails; i++) {
                headsorTails = Math.random();
                if (headsorTails < 0.5) {
                    head = head + 1;
                } else {
                    tails = tails + 1;
                }
            }
            System.out.println("Head Count : " + head);
            System.out.println("Tail Count : " + tails);
            headPercentage = ((head / numberTrails) * 100);
            tailPercentage = ((tails / numberTrails) * 100);
            System.out.println("Head Percentage : " + headPercentage + " %");
            System.out.println("Tail Percentage : " + tailPercentage + " %");
            s.close();
        } else {
            System.out.println("Enter positive number");
        }
    }
}
