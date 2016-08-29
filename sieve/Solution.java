import java.util.ArrayList;
public class Solution {

	public static ArrayList<Integer> sieve(int a) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		boolean[] prime = new boolean[a + 1];
		for (int i = 2; i < prime.length; i++) {
			prime[i] = true;
		}

		for (int i = 2; i < prime.length; i++) {
			for (int j = 2; i * j < prime.length; j++)
				prime[i * j] = false;
		}

		for (int i = 2; i < prime.length; i++)
			if (prime[i] == true)
				result.add(i);

		return result;
	}

	public static void main(String[] args) {
		ArrayList result = sieve(100);
		for (int i = 0; i < result.size(); i++) {
			System.out.println("Number " + result.get(i) + " is prime.");
		}
	}
}