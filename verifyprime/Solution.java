public class Solution {
	public static int isPrime(int a) {
		if (a < 3) return 0;
		for (int i = 2; i <= Math.sqrt(a); i++) {
			if (a % i == 0)
				return 0;
		}
		return 1;
	}

	public static void main(String args[]) {
		System.out.println(isPrime(Integer.valueOf(args[0])));
	}
}