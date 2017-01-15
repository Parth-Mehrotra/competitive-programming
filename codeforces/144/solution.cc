#include <iostream>

int main() {
	int n = 0;
	std::cin >> n; 
	int minIndex = 0;
	int maxIndex = 0;
	int min = 101;
	int max = 0;

	for (int i = 0; i < n; i++) {
		int input = 0;
		std::cin >> input;

		if (input <= min) {
			minIndex = i;
			min = input;
		}

		if (input > max) {
			maxIndex = i;
			max = input;
		}
	}

	std::cout << maxIndex + n - 1 - minIndex - (maxIndex > minIndex) << std::endl;
	return 0;
}
