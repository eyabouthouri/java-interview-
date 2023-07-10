package basic;

import io.vavr.control.Option;

/**
 * For this basic test, you should not use any library. e.g. you should not use
 * Math.pow for power method
 */
public class BasicTest {

	/**
	 * return i ^ n for positive Integer, None otherwise alse return None in case of
	 * errors
	 */
	public static Option<Integer> power(Integer i, Integer n) {
		if (i <= 0 || n < 0) {
			return Option.none();
		}

		int result = 1;
		while (n > 0) {
			if ((n & 1) == 1) {
				result *= i;
			}
			i *= i;
			n >>= 1;
		}

		return Option.some(result);
	}
}