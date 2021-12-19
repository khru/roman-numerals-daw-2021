import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RomanNumeralsTest {

	@Test
	public void given_a_1_should_return_a_I() {
    assertEquals("I", RomanNumerals.convert(1));
	}

  @Test
  public void given_a_2_should_return_a_II() {
    assertEquals("II", RomanNumerals.convert(2));
  }

  @Test
  public void given_a_3_should_return_a_III() {
    assertEquals("III", RomanNumerals.convert(3));
  }

  @Test
  public void given_a_4_should_return_a_IV() {
    assertEquals("IV", RomanNumerals.convert(4));
  }

  @Test
  public void given_a_5_should_return_a_V() {
    assertEquals("V", RomanNumerals.convert(5));
  }

  @Test
  public void given_a_6_should_return_a_VI() {
    assertEquals("VI", RomanNumerals.convert(6));
  }

  @Test
  public void given_a_8_should_return_a_VIII() {
    assertEquals("VIII", RomanNumerals.convert(8));
  }

}
