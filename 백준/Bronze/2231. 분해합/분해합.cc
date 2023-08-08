#include <iostream>
using namespace std;

int main() {
    int N;
    cin >> N;

    int result = 0;

    for (int i = 0; i < N; i++) {
        int number = i;
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        if (sum + i == N) {
            result = i;
            break;
        }
    }
    cout << result << endl;

    return 0;
}