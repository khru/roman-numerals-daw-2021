import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RomanNumeralsTest {

	@Test
	public void given_a_1_should_return_a_I() {
    assertTrue(RomanNumerals.convert(1).equals("I"));
	}

}
