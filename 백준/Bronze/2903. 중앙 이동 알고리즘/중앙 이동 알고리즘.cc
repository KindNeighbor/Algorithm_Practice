#include <iostream>
#include <cmath>

using namespace std;

int main() {
    int N;
    cin >> N;

    int a = 3;
    for (int i = 1; i < N; i++) {
        a += pow(2, i);
    }

    cout << a * a;
    return 0;
}