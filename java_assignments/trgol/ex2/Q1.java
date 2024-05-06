package trgol.ex2;

import java.util.Scanner;

public class Q1 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // to scan unntil 5 strings and to put it in an array

    // to check if the array have equals abc
    String[] arr = new String[5];
    int sumi = 0;
    System.out.println("Input 5 strings (seperated with enter): ");

    for (int i = 0; i < 5; i++) {
      System.out.println("Input a string: ");
      arr[i] = input.nextLine();
      System.out.println("Input a number: ");
      sumi += input.nextInt();
          }
    System.out.println(" ");

    for (int i = 0; i < 5; i++) {
      if (arr[i].equals("abc")) {
        System.out.println("Pingo");
        break;
      }
    }
    System.out.println("oh oh");
    System.out.println("The root of sum " + Math.sqrt(sumi));
    if (Math.sqrt(sumi) >= 5) {
      System.out.println("Yofe");
    }else{
      System.out.println("Small");
    }
    input.close();
  }
}
