package Exercicios;

// Encontre a substring palíndroma mais longa na string abaixo:
// "babad"

public class Ex03 {
  public static String main(String text) {
    int stringSize = text.length();
    String biggerPalindrome = "";

    for (int i = 0; i < stringSize; i++) {
      for (int j = i + 1; j <= stringSize; j++) {
        String substring = text.substring(i, j);
        if (isPalindrome(substring) && substring.length() > biggerPalindrome.length()) {
          biggerPalindrome = substring;
        }
      }
    }

    return biggerPalindrome;
  }

  public static boolean isPalindrome(String text) {
    int start = 0;
    int end = text.length() - 1;

    while (start < end) {
      if (text.charAt(start) != text.charAt(end)) {
        return false;
      }
      start++;
      end--;
    }

    return true;
  }
}
