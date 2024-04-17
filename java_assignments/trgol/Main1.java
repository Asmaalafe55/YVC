// package main;

public class Main1{
public static void main (String[] argv){

// Ex1) define 3 variables that have : int number and 2 double numbers
// it calculates and prints to the screen :
// mul of 3 numbers, average of 3 numbers, the largest number of them,
// remainder of dividing two real numbers

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

// Ex2) Write a program that calculates the following formula:
// Circumference of a circle: R*Pi*2 where Pi is constant and R is the radius of a circle
// Area of a circle: R*R*Pi
// Perimeter of a square: side length = 4
// Area of a square: side length*side length
public static void calculatesFunction(){
    
}



// Ex3)
public static void printMultipleTable(){
    for (int i=1;i<=10;i++){
        for(int j=1;j<=10;j++){
            System.out.println(i+"*"+j+"="+(i*j));
        }
    }
}

// Ex4)
public static void printUnifid(){
    for (char ch ='a';ch<='z';ch++){
        System.out.println(Integer.valueOf(ch));
    }
}

}