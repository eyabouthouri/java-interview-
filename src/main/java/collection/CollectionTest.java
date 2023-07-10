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
		return input.stream().map(number -> Math.pow((number * 2) + 3, 5)).collect(Collectors.toList());
	}

	/**
	 * operation : abc -> AbcAbc
	 */
	public static List<String> compute2(List<String> input) {
		return input.stream().map(str -> str.substring(0, 1).toUpperCase() + str + str.substring(0, 1).toUpperCase())
				.collect(Collectors.toList());
	}

}
