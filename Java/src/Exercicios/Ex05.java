package Exercicios;

// Verifique se a string é um anagrama de um palíndromo
// Exemplo: "racecar" -> true

public class Ex05 {

  static public Boolean main(String text) {
    Boolean result = false;
    String letters[] = text.split("");
    int odd = 0; // impar

    for (int i = 0; i < letters.length; i++) {
      String letter = letters[i];
      int tempTimes = 0;

      for (int j = 0; j < letters.length; j++) {
        String letter2 = letters[j];

        if (letter.equals(letter2)) {
          tempTimes++;
        }
      }

      if (tempTimes % 2 != 0) {
        odd++;
      }
    }

    if (odd <= 1) {
      result = true;
    }

    return result;
  }
}
