import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RomanNumeralsTest {

	@Test
	public void given_a_1_should_return_a_I() {
    assertEquals("I", RomanNumerals.convert(1));
	}

}
