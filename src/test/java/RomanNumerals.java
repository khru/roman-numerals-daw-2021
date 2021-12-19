public class RomanNumerals {
  public static String convert(int number) {
    StringBuilder result = new StringBuilder();

    if (number >= 10) {
      result.append(appendCharacter("X", number / 10));
      number %= 10;
    }
    if (number == 9) {
      result.append("IX");
      number -= 9;
    }
    if (number >= 5) {
      result.append("V");
      number -= 5;
    }
    if (number == 4) {
      result.append("IV");
      number -= 4;
    }

    return result.append(appendCharacter("I", number)).toString();
  }

  private static String appendCharacter(String character, int times) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < times ; i++) {
      result.append(character);
    }

    return result.toString();
  }
}
