package lectures.lec2;

import java.util.Scanner;

class Applications {

  public static void main(String[] args) {
    int[] numbers = new int[5];
    int positiveNumbers = 0;
    int counter = 0;

    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Enter a text");
      for (int i = 0; i < 5; i++) {
        numbers[i] = scanner.nextInt();
        if (numbers[i] > 0) {
          positiveNumbers += numbers[i];
          counter++;
        }
      }
    }
    System.out.println(
      "the sum of the positive numbers that you entered : " +
      positiveNumbers +
      "\nthe number of the positive numbers you entered is : " +
      counter
    );
  }
}
