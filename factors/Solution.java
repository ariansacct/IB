public class Solution {
	public ArrayList<Integer> allFactors(int a) {
		ArrayList<Integer> firstHalf =  new ArrayList<Integer>();
		ArrayList<Integer> secondHalf = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		double sqrta = Math.sqrt(a);
		for (int i = 1; i <= sqrta; i++) {
			if (a % i == 0) {
				firstHalf.add(i);
				if (i != sqrta)
					secondHalf.add(a / i);
			}
		}
		for (int i = 0; i < firstHalf.size(); i++)
			result.add(firstHalf.get(i));
		for (int i = secondHalf.size() - 1; i >= 0; i--)
			result.add(secondHalf.get(i));

		return result;
	}
}