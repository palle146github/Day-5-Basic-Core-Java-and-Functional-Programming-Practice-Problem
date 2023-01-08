package Functionalprograms;

import java.util.Scanner;

public class Twodimensionalarray {
    public static void main(String[] args) {
        int noOfrows, noOfcolumns ;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of rows of an array ==> ");
        noOfrows = s.nextInt();
        System.out.println("Enter number of columns of an array ==> ");
        noOfcolumns = s.nextInt();
        int[][] array = new int[noOfrows][noOfcolumns];
        for (int i = 0; i < noOfrows ; i++){
            for(int j = 0; j < noOfcolumns; j++){
                System.out.println("Enter" + "("+ i +","+ j+")" +"th element ==> ");
                int element = s.nextInt();
                array[i][j] = element;
            }
        }
        for (int i = 0; i < noOfrows ; i++){
            for(int j = 0; j < noOfcolumns; j++){
                System.out.print(" "+array[i][j]);
            }
            System.out.println("");
        }

    }
}
