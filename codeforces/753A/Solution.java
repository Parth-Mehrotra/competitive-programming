import java.util.HashSet;
import java.util.Scanner;

public class Solution {

	private static boolean getPossibilities(HashSet<Integer> solution, int n) {
		if (solution.contains(n)) return false;

		if (n == 2) {
			if (solution.contains(2)) {
				return false;
			} else {
				solution.add(2);
				return true;
			}
		}

		for (int i = 1; i <= n; i++) {
			if (!solution.contains(i)) {
				int k = n-i;
				solution.add(i);
				boolean child = k == 0 || getPossibilities(solution, k);
				if (child) {
					return true;
				} else {
					solution.remove(i);
				}
			}
		}

		return true;
	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.nextLine());
		
		HashSet<Integer> solution = new HashSet<Integer>();
		getPossibilities(solution, n);

		System.out.println(solution.size());
		for (int i : solution) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
