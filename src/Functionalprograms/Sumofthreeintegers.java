package Functionalprograms;

import java.util.Scanner;

public class Sumofthreeintegers {
    public static void main(String[] args) {
        int noElements;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of elements of an array ==> ");
        noElements = s.nextInt();
        int[] array = new int[noElements];
        int sum = 0;
        for (int i = 0; i < noElements; i++) {
            System.out.println("Enter" + "(" + i + "th element ==> ");
            int element = s.nextInt();
            array[i] = element;
        }

        for (int i = 0; i < noElements; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println("");
        for(int i = 0; i< noElements; i++) {
            for(int j = 0; j < noElements; j++) {
                if( i == j ){
                    continue;
                }
                else{
                    for(int k = 0; k < noElements; k++) {
                        if (j == k) {
                            continue;
                        } else {
                            if (array[i] != array[j] && array[j] != array[k] && array[i] == array[k]) {
                                sum = array[i] + array[j] + array[k];
                            }
                        }
                        if(sum == 0) {
                            System.out.println("Triplets are arr " + array[i] + " " + array[j]+ " " + array[k] );
                        }
                        else{
                            System.out.println("No distinct triplets are equal to zero");
                        }
                    }
                }
            }
        }
    }
}
