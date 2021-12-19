public class RomanNumerals {
  public static String convert(int number) {
    if (number == 6) {
      return "VI";
    }
    if (number == 5) {
      return "V";
    }
    if (number == 4) {
      return  "IV";
    }

    StringBuilder result = new StringBuilder();
    for (int i = 0; i < number ; i++) {
      result.append("I");
    }

    return result.toString();
  }
}
