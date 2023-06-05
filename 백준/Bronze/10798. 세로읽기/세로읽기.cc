#include <iostream>
#include <vector>
#include <string>
using namespace std;

int main() {
    vector<string> v;
    
    for (int i = 0; i < 5; i++) {
        string s;
        cin >> s;
        v.push_back(s);
    }
    
    string ans;
    
    for (int i = 0; i < 15; i++) {
        for (int j = 0; j < 5; j++) {
            if (v[j].length() > i) {
                ans.push_back(v[j][i]);
            } else {
                continue;
            }
        }
    }
    
    cout << ans;
    
    return 0;
}