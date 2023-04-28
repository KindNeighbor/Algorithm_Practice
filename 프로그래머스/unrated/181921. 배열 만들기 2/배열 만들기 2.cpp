#include <string>
#include <vector>

using namespace std;

vector<int> solution(int l, int r) {
    vector<int> answer;
    for (int i = l; i <= r; i++) {
        string a = to_string(i);
        int cnt = 0;
        for (int j = 0; j < a.size(); j++) {
            if (a[j] == '5' || a[j] == '0') {
                cnt++;
            }
        }
        if (cnt == a.size()) {
            answer.push_back(i);
        }
    }
    if (answer.size() == 0) {
        return vector<int> {-1};
    } else {
        return answer;
    }
}