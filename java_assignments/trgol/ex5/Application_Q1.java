package trgol.ex5;

public class Application_Q1 {

  public static void main(String[] args) {
    char[][] matrix = {
      { 'A', 'F', 'R', 'a', 'b' },
      { 'A', 'X', 'G', 'H', 'L' },
      { 'N', 'M', 'V', 'z', 'y' },
      { 'Z', 'E', 'T', 'Y', 'U' },
      { 'a', 'b', 'c', 'd', 'e' },
    };
    for (int i = 0; i < matrix.length; i++) {
      char minimum = '~';
      for (int j = 0; j < matrix[i].length; j++) {
        // searching the minimum char
        if (Character.isLowerCase(matrix[i][j]) && matrix[i][j] < minimum) {
          minimum = matrix[i][j];
        }
      }
      for (int j = 0; j < matrix[i].length; j++) {
        // replacing the minimum char with all the capital letters
        if (minimum == '~') {
          matrix[i][j] = '%';
          // if the minimum does not changed, it means that there is no capital letter in the array
        } else if (Character.isUpperCase(matrix[i][j])) {
          matrix[i][j] = minimum;
        }
      }
    }
  }
}
