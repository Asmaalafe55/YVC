package trgol.ex3;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String letters = input.nextLine();
        Q2_checkLetters checkLetters = new Q2_checkLetters(letters);
        // checkLetters.printArray();
        System.out.println(checkLetters.checkAllLetters());
        input.close();

    }
}
