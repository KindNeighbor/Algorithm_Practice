#include <iostream>
#include <string>

using namespace std;

int main() {
    int N;
    cin >> N;

    int num = 666;
    int cnt = 1;

    while (cnt != N) {
        num++;
        if (to_string(num).find("666") != string::npos) {
            cnt++;
        }
    }

    cout << num << endl;

    return 0;
}