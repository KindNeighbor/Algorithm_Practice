#include <iostream>
#include <vector>

using namespace std;

int main() {
    int N, B;
    vector<char> v;
    cin >> N >> B;
    
    while(N > 0) {
        int a = N % B;
        if (a >= 10) {
            v.push_back((char)(a - 10 + 'A'));
        } else {
            v.push_back((char)(a + '0'));
        }
        
        N /= B;
    }
    
    string s = "";
    for (int i = v.size() - 1; i >= 0; i--) {
        s += v[i];
    }
    
    cout << s;
}