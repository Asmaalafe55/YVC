package homeTasks.task1;

import java.util.Scanner;

public class Methods {
    // 1) A function that checks how many times a certain character appears in an array of strings.
    // The function receives an input of: an array of strings, a character and returns the number
    //  of occurrences of the character in the string.

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

    // 2) An interesting number is a number that meets the following conditions:
    // A. is a 3 digit number
    // B. Adding the result of each digit to the power of 3 is equal to the number itself.
    // Write a function that prints all the interesting numbers that are in the range between 111-999.

    public void interestingNumber(){
        int a;
        int b;
        int c;
        int temp;

        for (int i = 111;i<999;i++){
            temp = i;
            a= temp%10; // taking the first digit
            temp/=10;
            b= temp%100; // taking the seconed digit
            temp/=10;
            c= temp%1000; // taking the third digit
            if ((a*a*a + b*b*b + c*c*c) == i ){ // checking if the number is special
                System.out.println(i);
            }
        }
    }
    // 3) Write a function that receives a number from the user, when the number of digits
    //  in it is unknown. The function will break the number into two numbers, where the first
    //  number includes the even terms of the original number and the second number includes the
    //  odd terms. The program will print the original number, the two numbers created as well
    //  as their product.

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

    // 4)A) You must write a function that prints the number of digits of a number

    public void  numbersDigitsSum(int number) {
		int sum=0;
		for( sum=0; number!=0; number=number/10){    
			sum = sum + number % 10;  // taking the right digit from the number
		}  
		System.out.println("Digits sum is :"+sum);
	}
	
	// 4)B) You must write a function that accepts a string and returns the longest word in the sentence

	public String mostLongWord(String s) {
		String st=null;
		String[] arr = s.split(" "); // spliting the sentence into words and put the words in an array
		int maxSize=-1;
		for(String str : arr) { // looping into array to check the word's length
			if(str.length()>=maxSize) {
				maxSize=str.length();
				st=str;
			}
		}
		return st;
		
	}

    // 4)C) You must write a function that receives an input of a positive number and prints
    //  whether it is a prime or non-prime number and whether the number is even or odd.
    //  2 prints will be printed for each number: even/even and prime/not prime

    public void primeOddEven(int num) {
	    boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {
	      if (num % i == 0) { // checking if the number is prime
	        flag = true;
	        break;
	      }
	    }
	    if(!flag)
	    	System.out.println("Number : "+ num +" is Prime!");
	    else
	    	System.out.println("Number : "+ num +" is not Prime!");

	    if(num%2==0) { // checking if the number is even
	    	System.out.println("Number : "+ num +" is Even!");
	    }
	    else { // the number is odd
	    	System.out.println("Number : "+ num +" is Odd!");

	    }
   }
    
}
