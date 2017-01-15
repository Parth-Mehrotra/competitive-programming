import java.util.Scanner;

public class Solution {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.nextLine());
		int totalProblems = 0;
		for (int i = 0; i < n; i++) {
			String line = input.nextLine();
			String data[] = line.split(" ");
			int a = Integer.parseInt(data[0]);
			int b = Integer.parseInt(data[1]);
			int c = Integer.parseInt(data[2]);
			if (a + b + c > 1) {
				totalProblems++;
			}
		}

		System.out.println(totalProblems);
	}
}
