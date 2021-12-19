import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsTest {

  @ParameterizedTest
  @CsvSource({
    "1,I",
    "5,V",
    "10,X"
  })
  public void given_a_unit_number_should_convert_it(int number, String expected) {
    assertEquals(expected, RomanNumerals.convert(number));
  }

  @ParameterizedTest
  @CsvSource({
    "4,IV",
    "9,IX",
    "14,XIV",
    "15,XV",
    "19,XIX",
  })
  public void given_a_subtracted_unit_should_convert_it(int number, String expected) {
    assertEquals(expected, RomanNumerals.convert(number));
  }

  @ParameterizedTest
  @CsvSource({
    "2,II",
    "3,III",
    "6,VI",
    "7,VII",
    "8,VIII",
    "11,XI",
    "12,XII",
    "13,XIII",
    "16,XVI",
    "17,XVII",
    "18,XVIII",
    "20,XX",
  })
  public void given_a_number_should_return_a_repeatable_number(int number, String expected) {
    assertEquals(expected, RomanNumerals.convert(number));
  }

}
