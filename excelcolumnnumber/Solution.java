import java.util.Map;
import java.util.HashMap;

public class Solution {

	public static int titleToNumber(String columnName) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < 26; i++) {
			char c = (char) ((int)'A' + i);
			map.put(c, 1 + i);
		}

		int sum = 0;
		for (int i = 0; i < columnName.length(); i++) {
			// System.out.println(map.get(columnName.charAt(i)) * (int) Math.pow(26, (columnName.length() - 1 - i)));
			sum += map.get(columnName.charAt(i)) * (int) Math.pow(26, (columnName.length() - 1 - i));
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(titleToNumber(args[0]));
	}
}