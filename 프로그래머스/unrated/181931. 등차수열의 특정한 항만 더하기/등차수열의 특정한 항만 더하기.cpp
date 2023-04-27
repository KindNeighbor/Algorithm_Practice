#include <string>
#include <vector>
#include <iostream>

using namespace std;

int solution(int a, int d, vector<bool> included) {
    int sum = 0;
    int cur = a;
    for (int i = 0; i < included.size(); i++) {
        
        if (included[i]) {
            sum += cur;
        }
        
        cur += d;
    }
    
    return sum;
}