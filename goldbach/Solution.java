import java.util.ArrayList;
public class Solution {
	public int getNextPrimeLessThan(int number, int start) {
		for (int i = start; i <= number; i++)
			if (isPrime(i))
				return i;
		return -1;
	}

	public boolean isPrime(int number) {
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

	public ArrayList<Integer> primesum(int a) {

		ArrayList<Integer> result = new ArrayList<Integer>();
		int start = 2;
		int currentPrime = getNextPrimeLessThan(a, start);
		while (! isPrime(a - currentPrime)) {
			currentPrime = getNextPrimeLessThan(a, currentPrime + 1);
		}
		result.add(currentPrime);
		result.add(a - currentPrime);

		return result;

	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		ArrayList<Integer> result = solution.primesum(Integer.valueOf(args[0]));
		for (int i = 0; i < result.size(); i++)
			System.out.println(result.get(i));
	}
}