package trgol.ex2;

import java.util.Scanner;

public class Q3 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a, b;
    System.out.println("Enter the number of the students: ");
    a = input.nextInt();
    String[] arr1 = new String[a];
    for (int i = 0; i < arr1.length; i++) {
      arr1[i] = input.nextLine();
    }

    System.out.println("Enter the number of the students: ");
    b = input.nextInt();
    String[] arr2 = new String[b];
    for (int i = 0; i < arr2.length; i++) {
      arr1[i] = input.nextLine();
    }
    String[] array = new String[a > b ? a : b];
    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr2.length; j++) {
        if (arr1[i].equals(arr2[j])) {
          array[i] = arr1[i];
        }
      }
    }
  }
}
