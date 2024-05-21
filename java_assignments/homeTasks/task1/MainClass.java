package homeTasks.task1;

import java.util.Scanner;

public class MainClass
 {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Please enter 10 numbers: ");
    int[] numbers = new int[10];
    int sum =0;
    int maxNum=0;
    for (int i=0; i<10;i++){
        int temp = input.nextInt();
        while (temp <=0){
            System.out.println("Please enter a valid number:");
            temp = input.nextInt();
        }
        numbers[i] = temp;
        sum +=temp;
        if(temp>maxNum){
            maxNum = temp;
        }
    }
    boolean flag = true;
    while(flag){
    System.out.println("Menu");
    System.out.println("1.sum of all numbers \r\n" + //
                "2.max number \r\n" + //
                "3.print all numbers \r\n" + //
                "4.Exit\r" + //
                "");
    int choice = input.nextInt();
    switch(choice){
        case 1: 
            System.out.println("Sum is:" + sum);
            break;
        case 2:
            System.out.println("Max is: " + maxNum);
            break;
        case 3:
            System.out.println("All Numbers");
            for(int i=0;i<10;i++){
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
            break;
        case 4:
            System.err.println("Bye Bye");
            flag=false;
            break;
        default:
            System.out.println("Choose from menu.");
    }
}

    }
}
