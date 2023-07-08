package Exercicios;

import java.util.ArrayList;

// Remova todos os caracteres duplicados da string abaixo:
// "Hello, World!"
public class Ex02 {
  public static String main(String text) {

    int stringSize = text.length();
    ArrayList<String> repeatedLetters = new ArrayList<String>();
    String textArr[] = text.split("");
    String result = "";

    for (int i = 0; i < stringSize; i++) {

      if (!repeatedLetters.contains(textArr[i])) {

        result += textArr[i];
        repeatedLetters.add(textArr[i]);

      }
    }

    return result;
  }
}
