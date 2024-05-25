package trgol.ex3;

import java.util.Scanner;

public class Q1 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Q1_numbers numbers = new Q1_numbers(0);

    do {
      numbers.setNumber(input.nextInt());
    } while (numbers.getNumber() != 1);

    System.out.println(numbers.getNumbers());

    input.close();
  }
}
