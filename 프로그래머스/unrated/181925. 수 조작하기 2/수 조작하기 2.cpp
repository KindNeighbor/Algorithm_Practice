#include <string>
#include <vector>

using namespace std;

string solution(vector<int> numLog) {
    string ans = "";
    for (int i = 0; i < numLog.size() - 1; i++) {
        if (numLog[i+1] - numLog[i] == 1) {
            ans += 'w';
        } else if (numLog[i+1] - numLog[i] == 10) {
            ans += 'd';
        } else if (numLog[i+1] - numLog[i] == -1) {
            ans += 's';
        } else if (numLog[i+1] - numLog[i] == -10) {
            ans += 'a';
        }
    }

    return ans;
}