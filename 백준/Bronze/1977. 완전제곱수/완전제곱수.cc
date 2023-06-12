#include <iostream>
#include <vector>

using namespace std;

int main() {
    vector<int> v;
    int M, N;
    cin >> M >> N;

    for (int i = 1; i <= 100; i++) {
        if(M <= i * i && i * i <= N) {
            v.push_back(i*i);
        }
    }
    
    if (v.size() == 0) {
        cout << -1;
        return 0;
    }
    
    int min = v[0];
    int sum = 0;
    
    for (int i = 0; i < v.size(); i++) {
        sum += v[i];
    }
    
    cout << sum << "\n";
    cout << min;
    
    return 0;
}