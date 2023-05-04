#include <iostream>
#include <vector>

using namespace std;

int GCD(int a, int b);

int main() {
    int N;
    cin >> N;
    int a;
    cin >> a;
    vector<int> v;
    int b;
    for (int i = 0; i < N-1; i++) {
        cin >> b;
        v.push_back(b - a);
        a = b;
    }
    
    int g = v[0];
    for (int i = 1; i < N-1; i++) {
        g = GCD(g,v[i]);
    }
    
    int sum = 0;
    for (int i = 0; i < v.size(); i++) {
        sum += (v[i]/g) - 1;
    }
    
    cout << sum;
}

int GCD(int a, int b) {
    if(a%b==0) {
        return b;
    } return GCD(b, a%b);
}