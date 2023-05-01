#include <iostream>
#include<cmath>

using namespace std;

int main() {
    string s;
    int N;
    int ans = 0;
    cin >> s >> N;
        
    for (int i = 0; i < s.length(); i++) {
        if (s[i] >= '0' && s[i] <= '9') {
            ans += (s[i] - '0') * pow(N, s.length() - 1 - i);
        } else if (s[i] >= 'A' && s[i] <= 'Z')
            ans += (s[i] - 55) * pow(N, s.length() - 1 - i);
        }
    
    cout << ans;
    return 0;
}