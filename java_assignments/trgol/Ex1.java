// define 3 variables that have : int number and 2 double numbers
// it calculates and prints to the screen : mul of 3 numbers, average of 3 numbers, the largest number of them,  remainder of dividing two real numbers
// package main;

public class Ex1{
public static void main (String[] argv){
int firstInt =100;
double firstDouble = 20;
double seconedDouble =30;

double result = firstInt*firstDouble*seconedDouble;
System.out.println ("Result of multiplying all 3 numbers: "+ result);
calcAverage(firstInt, firstDouble,seconedDouble);
calcMax(firstInt, firstDouble,seconedDouble);

System.out.println("The remainder of dividing two real numbers: "+ firstDouble%seconedDouble);

}
public static void calcAverage(int a, double b, double c){
    double total = a+b+c;
    double result = total/3;
    System.out.println("The average of 3 numbers: "+ result);
}

public static void calcMax(int a, double b, double c){
    if (a>b && a>c){
    System.out.println("The max of 3 numbers: "+ a);
    } else if (b>c){
    System.out.println("The max of 3 numbers: "+ b);
    } else{
    System.out.println("The max of 3 numbers: "+ c);
    }
}


}