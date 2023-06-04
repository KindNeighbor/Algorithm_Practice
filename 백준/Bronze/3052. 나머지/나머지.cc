#include <iostream>

using namespace std;

int main() {
    int arr[42] = {0};
    for (int i = 0; i < 10; i++) {
        int a;
        cin >> a;
        a = a % 42;
        arr[a]++;
    }
    
    int sum = 0;
    for (int i = 0; i < 42; i++) {
        if (arr[i] >= 1) {
            sum++;
        } else {
            continue;
        }
    }
    cout << sum;
    return 0;
}