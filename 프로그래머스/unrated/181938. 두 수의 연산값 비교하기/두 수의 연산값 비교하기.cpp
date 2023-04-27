#include <string>
#include <vector>

using namespace std;

int solution(int a, int b) {
    string s = to_string(a) + to_string(b);
    int num1 = stoi(s);
    int num2 = 2 * a * b;
    return num1 > num2 ? num1 : num2;
}