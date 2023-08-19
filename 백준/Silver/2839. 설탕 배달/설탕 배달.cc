#include <iostream>

int main() {
    int N;
    std::cin >> N;

    int cnt = 0;

    while (true) {
        if (N % 5 == 0) {
            cnt += N / 5;
            break;
        } else {
            N -= 3;
            cnt++;
        }

        if (N < 0) {
            cnt = -1;
            break;
        }
    }

    std::cout << cnt << std::endl;

    return 0;
}