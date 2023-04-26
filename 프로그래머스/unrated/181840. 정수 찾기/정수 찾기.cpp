#include <string>
#include <vector>

using namespace std;

int solution(vector<int> num_list, int n) {
    int answer = 0;
    for (int a : num_list) {
        if (n == a) {
            return 1;
        }
    }
    
    return 0;
}