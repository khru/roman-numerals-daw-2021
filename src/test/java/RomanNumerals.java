public class RomanNumerals {
  private static int[] NUMBERS = {10, 9, 5, 4, 1};
  private static String[] SYMBOLS = {"X", "IX", "V", "IV", "I"};

  public static String convert(int number) {
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < NUMBERS.length; i++) {
        result.append(appendSymbol(SYMBOLS[i], number / NUMBERS[i]));
        number %= NUMBERS[i];
    }
    return result.toString();
  }

  private static String appendSymbol(String symbol, int times) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < times ; i++) {
      result.append(symbol);
    }

    return result.toString();
  }
}
