#include <iostream>
#include <vector>

using namespace std;

int main() {
    vector<int> v;
    v.resize(26);
    
    string s;
    cin >> s;
    for (int i = 0; i < s.length(); i++) {
        v[s[i] - 'a']++;
    }
    
    for (int i = 0; i < v.size(); i++) {
        cout << v[i] << " ";
    }
    return 0;
}