#include <iostream>
#include <vector>

using namespace std;

int main() {
    int n;
    while(1) {
        vector<int> v;
        cin >> n;
        if (n == -1) {
            break;
        }
        
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                v.push_back(i);
                sum += i;
            }
        }
        
        if (n == sum) {
            cout << n << " = ";
            for (int i = 0; i < v.size() - 1; i++) {
                cout << v[i] << " + ";
            }
            cout << v[v.size() - 1] << '\n';
        } else {
            cout << n << " is NOT perfect." << '\n';
        }
    }
    return 0;
}