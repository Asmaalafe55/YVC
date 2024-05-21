package java_assignments.homeTasks.task1;

import java.util.Scanner;

public class Methods {
    
    public int charRepeat(String arr[],char c) {
		int counter=0;
		for (String s : arr) {
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)==c) { // if the letter is the same letter as the one that we received "c"
					counter++; 
				}
			}
		}
		return counter;
	}

    public void intrestedNumber(){
        int a;
        int b;
        int c;
        int temp;

        for (int i = 111;i<999;i++){
            temp = i;
            a= temp%10;
            temp/=10;
            b= temp%100;
            temp/=10;
            c= temp%1000;
            if ((a*a*a + b*b*b + c*c*c)== i ){
                System.out.println(i);
            }
        }
    }
    // 3) Write a function that receives a number from the user, when the number of digits
    //  in it is unknown. The function will break the number into two numbers, where the first
    //  number includes the even terms of the original number and the second number includes the
    //  odd terms. The program will print the original number, the two numbers created as well
    //  as their product. For example if the original number is 123456 then the two new
    //  numbers will be 135,246 and their product is 33210

    public void prntNumbers(){
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter a number: ");
        num = input.nextInt(); // receiving a number from the user
        int first = 0;
        int secend = 0;
        int temp = num;
        while(temp!=0){ // breaking the number into two numbers, odd and even
            if(temp%10%2 == 0 ){
                first = first*10+(temp%10);
            }
            else if(temp%10%2==1){
                secend = secend*10 + (temp%10);
            }
            temp/=10;
        }
        int even = 0;
        int odd = 0;
        while(first!=0){ // the numbers are upside down
            even = even*10 + (first%10);
            first/=10;
        }
        while(secend!=0){
            odd = odd*10 + (secend%10);
            secend/=10;
        }
        System.out.println("even: " + even);
        System.out.println("odd: " + odd);
        System.out.println("sum: " + even*odd);
    }

    public void  numbersDigitsSum(int number) {
		int sum=0;
		for( sum=0; number!=0; number=number/10){    
			sum = sum + number % 10;  
		}  
		System.out.println("Digits sum is :"+sum);
	}
	
	
	public String mostLongWord(String s) {
		String st=null;
		String[] result = s.split(" ");
		int maxSize=-1;
		for(String str : result) {
			if(str.length()>=maxSize) {
				maxSize=str.length();
				st=str;
			}
		}
		return st;
		
	}

    public void primeOddEven(int num) {
	    boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }
	    if(!flag)
	    	System.out.println("Number : "+ num +" is Prime!");
	    else
	    	System.out.println("Number : "+ num +" is not Prime!");

	    if(num%2==0) {
	    	System.out.println("Number : "+ num +" is Even!");
	    }
	    else {
	    	System.out.println("Number : "+ num +" is Odd!");

	    }
   }



    
}
