package Exercicios;

// Coloque em maiúscula a primeira letra de cada frase na string:
// hello, how are you? i'm fine, thank you.

public class Ex04 {
  public static String main(String text) {

    String textWords[] = text.split(" ");
    String result = "";

    // CamelCase
    for (String word : textWords) {
      String firstLetter = word.substring(0, 1).toUpperCase();

      String restOfWord = word.substring(1).toLowerCase();

      result += firstLetter + restOfWord + " ";
    }

    return result;
  }
}
