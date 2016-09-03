import java.util.ArrayList;
public class Solution {
	public ArrayList<Integer> findPrimesLessThan(int number) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = 2; i <= number; i++) {
			if (isPrime(i)) {
				result.add(i);
				break;
			}
		}
		return result;
	}

	public boolean isPrime(int number) {
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

	public ArrayList<Integer> primesum(int a) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		System.out.println("taking too much time after getting here");
		ArrayList<Integer> first = findPrimesLessThan(a);
		System.out.println("taking too much time before getting here " + first.size());
		for (Integer i : first) {
			if (isPrime(a - i)) {
				temp.add(i);
				temp.add(a - i);
				if (temp.size() == 2)
					break;
			}
		}
		// ArrayList<Integer> result = new ArrayList<Integer>();
		// result.add(temp.get(0));
		// result.add(temp.get(1));

		return temp;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		ArrayList<Integer> result = solution.primesum(Integer.valueOf(args[0]));
		for (int i = 0; i < result.size(); i++)
			System.out.println(result.get(i));
	}
}