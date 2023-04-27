#include <string>
#include <vector>

using namespace std;

int solution(vector<int> num_list) {
    int timeSum = num_list[0];
    int sum = num_list[0];
    for (int i = 1; i < num_list.size(); i++) {
        sum += num_list[i];
        timeSum *= num_list[i];
    }
    
    return timeSum < sum * sum ? 1 : 0;
}