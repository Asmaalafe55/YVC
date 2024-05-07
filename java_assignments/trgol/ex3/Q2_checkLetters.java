package trgol.ex3;

public class Q2_checkLetters {
    private String[] letters  = new String[100];
    private String[] allLetters = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

    public Q2_checkLetters(String letters) {
            this.letters = letters.split("");
    }

    public boolean checkAllLetters(){
        for (int i=0;i<allLetters.length;i++){
            for (int j=0; j< letters.length;j++){
                if (allLetters[i]==letters[j]){
                    break;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }

    public String[] getLetters() {
        return letters;
    }
    public void printArray(){
        for (int i=0;i<letters.length;i++){
            System.out.print(letters[i]);
        }
    }

    

    
}
