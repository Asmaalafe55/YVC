package trgol.ex3;

public class Q1_numbers {
    private int[] numbers  = new int[100];
    private int number;


    public Q1_numbers(int number) {
        this.number = number;
    }


    public int[] getNumbers() {
        return numbers.length<5 ? numbers : lastNumbers(); 
    }

    private int[] lastNumbers(){
        int[] lastFive = new int[5];
        int j=0;
        for (int i = numbers.length-5 ; i<numbers.length ; i++){
            lastFive[j]=  numbers[i];
            j++;
        }
        return lastFive;

    }


    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }


    public void setNumber(int number) {
        this.number = number;
    }


    public int getNumber() {
        return number;
    }
    
    


    
}
