#include <iostream>

using namespace std;

int GCD(int a, int b);

int main() {
    long long int a, b, c;
    cin >> a >> b;
    c = (a * b) / GCD(a, b);
    cout << c;
}

int GCD(int a, int b) {
    if (a % b == 0) {
        return b;
    }
    return GCD(b, a%b);
}