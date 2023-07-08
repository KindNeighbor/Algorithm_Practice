#include <string>
#include <vector>
#include <unordered_map>

using namespace std;

string solution(vector<string> survey, vector<int> choices) {
    
    string answer = "";
    unordered_map<char, int> map;
    map['R'] = 0; map['T'] = 0;
    map['C'] = 0; map['F'] = 0;
    map['J'] = 0; map['M'] = 0;
    map['A'] = 0; map['N'] = 0;

    for (int i = 0; i < survey.size(); i++) {
        if (choices[i] > 4)
            map[survey[i][1]] += choices[i] - 4;
        else if (choices[i] < 4) {
            map[survey[i][0]] += 4 - choices[i];
        }
    }

    if (map['R'] >= map['T'])
        answer = "R";
    else
        answer = "T";

    if (map['C'] >= map['F'])
        answer += "C";
    else
        answer += "F";

    if (map['J'] >= map['M'])
        answer += "J";
    else
        answer += "M";

    if (map['A'] >= map['N'])
        answer += "A";
    else
        answer += "N";

    return answer;
}