#include <iostream>
#include <string>

using namespace std;

int main(void) {
    string str;
    int n;
    cin >> str >> n;
    string newString;
    for (int i = 0; i < n; i++) {
        newString += str;
    }
    cout << newString;
    return 0;
}