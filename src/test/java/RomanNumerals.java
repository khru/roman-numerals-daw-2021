public class RomanNumerals {
  public static String convert(int number) {
    StringBuilder result = new StringBuilder();

    if (number == 10) {
      return "X";
    }
    if (number == 9) {
      return "IX";
    }
    if (number >= 5) {
      result.append("V");
      number -= 5;
    }
    if (number == 4) {
      return  "IV";
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
