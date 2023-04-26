#include <iostream>
#include <string>

using namespace std;

int main(void) {
    string str;
    cin >> str;
    string newString;
    
    for (char c : str) {
        if (c >= 'a' && c <= 'z') {
            c = c - 'a' + 'A';
        } else if (c >= 'A' && c <= 'Z') {
            c = c - 'A' + 'a';
        }
        newString += c;
    }
    cout << newString;
    return 0;
}