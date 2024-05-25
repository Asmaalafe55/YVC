package homeTasks.task1;

import java.util.Scanner;

public class MainClass {

  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.println("Please enter 10 numbers: ");
      int[] numbers = new int[10];
      int sum = 0;
      int maxNum = 0;
      for (int i = 0; i < 10; i++) {
        int temp = input.nextInt();
        while (temp <= 0) { // while the user did not enter a positive number it keeps asking him for a valid number
          System.out.println("Please enter a positive number:");
          temp = input.nextInt();
        }
        numbers[i] = temp; // saving in an array
        sum += temp; // calculates the sum
        if (temp > maxNum) { // searching the maximum number
          maxNum = temp;
        }
      }
      boolean flag = true; // to determine if the user wants to exit or not
      while (flag) {
        System.out.println("Menu");
        System.out.println(
          "1.sum of all numbers \r\n" + //
          "2.max number \r\n" + //
          "3.print all numbers \r\n" + //
          "4.Exit\r" + //
          ""
        );
        int choice = input.nextInt(); // reciving the choice
        switch (choice) {
          case 1:
            System.out.println("Sum is:" + sum);
            break;
          case 2:
            System.out.println("Max is: " + maxNum);
            break;
          case 3:
            System.out.println("All Numbers");
            for (int i = 0; i < 10; i++) {
              System.out.print(numbers[i] + " ");
            }
            System.out.println();
            break;
          case 4:
            System.err.println("Bye Bye");
            flag = false;
            break;
          default:
            System.out.println("Choose from menu."); // if the user chooses any other number that it is not in the menu
        }
        input.close();
      }
    }
  }
}
