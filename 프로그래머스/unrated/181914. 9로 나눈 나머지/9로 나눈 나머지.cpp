#include <string>
#include <vector>
#include <iostream>

using namespace std;

int solution(string number) {
    int sum = 0;
    for (int i = 0; i < number.size(); i++) {
        sum += number[i] - 48;
    }
    
    return sum % 9;
}