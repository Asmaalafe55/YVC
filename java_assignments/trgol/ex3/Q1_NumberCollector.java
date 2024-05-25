package trgol.ex3;

import java.util.LinkedList;

public class Q1_NumberCollector {

  private LinkedList listOfNumbers = new LinkedList();

  public void enterNumber(int number) {
    listOfNumbers.add(number);
  }

  public void printLastFive() {
    for (int i = listOfNumbers.size(); i > (listOfNumbers.size() - 5); i--) {
      System.out.println(listOfNumbers.get(i));
    }
  }
}
