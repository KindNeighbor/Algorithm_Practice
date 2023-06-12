#include <iostream>
#include <string>

using namespace std;

int main() {
	int N, num = 0;
	char L;

	cin >> N >> L;

	for (int i = 0; i < N; ++i) {
        while (to_string(++num).find(L) != string::npos);
    }

	cout << num;

	return 0;
}