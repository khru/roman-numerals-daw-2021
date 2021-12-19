public class RomanNumerals {
  public static String convert(int number) {
    if (number == 4) {
      return  "IV";
    }

    String result = "";
    for (int i = 0; i < number ; i++) {
      result += "I";
    }

    return result;
  }
}
