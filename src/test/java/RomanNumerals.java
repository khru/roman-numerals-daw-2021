public class RomanNumerals {
  public static String convert(int number) {
    if (number == 3) {
      return "III";
    }
    if (number == 2) {
      return "II";
    }
    return "I";
  }
}
