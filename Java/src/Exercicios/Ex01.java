package Exercicios;

// Reverta a ordem das palavras nas frases, mantendo a ordem das palavras:
// "Hello, World! OpenAI is amazing."
public class Ex01 {
  public static String main(String text) {

    String inverted = "";
    String arrStr[] = text.split(" ");

    for (int i = arrStr.length - 1; i >= 0; i--) {
      inverted += arrStr[i] + ' ';
    }

    return inverted;
  }
}
