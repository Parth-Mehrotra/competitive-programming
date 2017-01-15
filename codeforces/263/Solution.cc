#include <iostream>
#include <string>
#include <cstdlib>

inline int distance(int rows, int cols) {
	return std::abs(rows-2) + std::abs(cols-2);
}

int main() {
	bool found = false;
	for (int i = 0; i < 5; i++) {
		for (int j = 0; j < 5; j++) {
			bool val;
			std::cin >> val;
			if (val) {
				std::cout << distance(i, j) << std::endl;
				return EXIT_SUCCESS;
			}
		}
	}

	return EXIT_FAILURE;
}
