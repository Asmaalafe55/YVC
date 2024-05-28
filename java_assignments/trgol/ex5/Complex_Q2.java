package trgol.ex5;

public class Complex_Q2 {

  private int a;
  private int b;

  public Complex_Q2() {
    a = 0;
    b = 0;
  }

  public Complex_Q2(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public int getA() {
    return a;
  }

  public int getB() {
    return b;
  }

  public void setA(int a) {
    this.a = a;
  }

  public void setB(int b) {
    this.b = b;
  }

  public void printSqrt() {
    System.out.println(Math.sqrt(a * a + b * b));
  }
}
