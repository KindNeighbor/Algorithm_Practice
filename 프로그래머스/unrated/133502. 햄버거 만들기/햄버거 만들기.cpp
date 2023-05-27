#include <string>
#include <vector>

using namespace std;

int solution(vector<int> ingredient) {
    int cnt = 0;
    vector<int> v = {0};
    
    for (int x : ingredient) {
        if (v.back() == 1 && x == 2) v.back() = 12;
        else if (v.back() == 12 && x == 3) v.back() = 123;
        else if (v.back() == 123 && x == 1) {
            cnt++;
            v.pop_back();
        } else v.push_back(x);
    }
    
    return cnt;
}