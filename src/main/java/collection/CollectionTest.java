package collection;

import java.util.List;

/**
 * You should complete the function in this class
 * <p>
 * Feel free to define any method and / or class you want
 */
class CollectionTest {

	/**
	 * operation : x -> ((x * 2) + 3) ^ 5
	 */
	public static List<Double> compute1(List<Integer> input) {
		List<Double> result = new ArrayList<>();

		for (Integer number : input) {
			double computation = Math.pow((number * 2) + 3, 5);
			result.add(computation);
		}

		return result;
	}

	/**
	 * operation : abc -> AbcAbc
	 */
	public static List<String> compute2(List<String> input) {
		List<String> result = new ArrayList<>();

		for (String str : input) {
			String computation = str.substring(0, 1).toUpperCase() + str + str.substring(0, 1).toUpperCase();
			result.add(computation);
		}

		return result;
	}

}
