#include <iostream>

int main() {
	std::string a;
	std::cin >> a;

	std::string b;
	std::cin >> b;

	std::string result;

	for (int i = 0; i < a.length(); i++) {
		result += std::to_string(a[i] != b[i]);
	}

	std::cout << result << std::endl;
	return EXIT_SUCCESS;
}
