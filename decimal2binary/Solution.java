public class Solution {
	public static String findDigitsInBinary(int a) {
		if (a == 0 || a == 1)
			return Integer.toString(a);
		if (a < 2 * 2) {
			return Integer.toString(a / 2) + Integer.toString(a % 2);
		}

		return findDigitsInBinary(a / 2) + Integer.toString(a % 2);
	}

	public static void main(String[] args) {
		System.out.println(findDigitsInBinary(Integer.valueOf(args[0])));
	}
}