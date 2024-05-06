package trgol.ex2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int number = input.nextInt();
        int[] arr = new int[5];
        for (int i=0 ; i<5; i++){
            int temp = number%10;
            arr[i] = temp;
            number = number/10;
        }
        for (int i =0 ; i<5; i++){
            System.err.print(arr[i]);
        }
        System.err.println(" ");


    }
}
