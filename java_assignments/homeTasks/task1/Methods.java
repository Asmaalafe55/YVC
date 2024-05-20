package java_assignments.homeTasks.task1;

import java.util.Scanner;

public class Methods {
    
    public int charRepeat(String arr[],char c) {
		int counter=0;
		for (String s : arr) {
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)==c) {
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

    public void prntNumbers(){
        Scanner input = new Scanner(System.in);
        int num;
        num = input.nextInt();

        // 123456 - > 246 135 

        String strNumber = String.valueOf(num); // 123456
        int[] firstNum = new int[strNumber.length()];
        int j=0;
        int[] secondNum = new int[strNumber.length()];
        int k=0;

        for (int i=0; i<strNumber.length();i++){
            if(num%10%2==0){
                firstNum[j] = num%10;
                j++;
                num/=10;
            }
            else if(num%10%2 == 1){
                secondNum[k] = num%10;
                k++;
                num/=10;
            }
        }

        // now i have an array of the numbers : [1,3,5]  [2,4,6]
        // now i have to merge all of them to one number 

        for (int i =0; i<firstNum.length;i++){

        }


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
	    	System.out.println("Number : "+num +" is Prime!");
	    else
	    	System.out.println("Number : "+num +" is not Prime!");

	    if(num%2==0) {
	    	System.out.println("Number : "+num +" is Even!");
	    }
	    else {
	    	System.out.println("Number : "+num +" is Odd!");

	    }
   }



    
}
