package trgol.ex6;

public class Application_Q2 {

  public static void main(String[] args) {
    System.out.println(power(2, 4));
    System.out.println(isPower(25, 5));
    System.out.println(digitSum(34));
  }

  public static int power(int base, int exponent) {
    int powerr = 1;
    for (int i = 0; i < exponent; i++) {
      powerr *= base;
    }
    return powerr;
  }

  public static boolean isPower(int result, int base) {
    for (int i = 0; i < result / 2; i++) {
      if (power(base, i) == result) return true;
    }
    return false;
  }

  public static int digitSum(int num) {
    int sumi = 0;
    while (num != 0) {
      sumi += num % 10;
      num /= 10;
    }
    return sumi;
  }
}
