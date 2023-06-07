#include <string>
#include <vector>

using namespace std;

int getNumber(int n);

int solution(int number, int limit, int power) {
    int sum = 0;
    if (number == 1) {
        return 1;
    }
    
    for (int i = 1; i <= number; i++) {
        int a = getNumber(i);
        if (a > limit) {
            sum += power;
        } else {
            sum += a;
        } 
    }
    return sum;
}

int getNumber(int n) {
    int cnt = 0;
    for (int i = 1; i * i <= n; i++) {
        if (i * i == n) cnt++;
        else if (n % i == 0) cnt += 2;
    }
    return cnt;
}