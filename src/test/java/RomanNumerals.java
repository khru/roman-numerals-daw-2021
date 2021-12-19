import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class RomanNumerals {
  private final static SortedMap<Integer, String> ROMAN_NUMERALS = new TreeMap<>(
    Map.of(1,"I", 4, "IV", 5, "V", 9, "IX", 10, "X")).descendingMap();

  public static String convert(int number) {
    StringBuilder result = new StringBuilder();
    for(Map.Entry<Integer,String> entry : ROMAN_NUMERALS.entrySet()) {
      Integer decimalNumber = entry.getKey();
      String symbol  = entry.getValue();
      result.append(appendSymbol(symbol, number / decimalNumber));
      number %= decimalNumber;
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
