#include <string>
#include <vector>
#include <iostream>

using namespace std;

string solution(string myString) {
    string ans = "";
    for (char c : myString) {
        if (islower(c)) {
            ans += c;
            continue;
        } else {
            c = tolower(c);
            ans += c;
        }
    }
    
    return ans;
}