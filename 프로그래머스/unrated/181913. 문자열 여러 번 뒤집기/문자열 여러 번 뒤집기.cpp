#include <string>
#include <vector>
#include <iostream>

using namespace std;

string solution(string my_string, vector<vector<int>> queries) {
    for (int i = 0; i < queries.size(); i++) {
        for (int j = 0; j < (queries[i][1] - queries[i][0] + 1) / 2; j++) {
            char c = my_string[queries[i][0] + j];
            my_string[queries[i][0] + j] = my_string[queries[i][1] - j];
            my_string[queries[i][1] - j] = c;
        }
    }
    
    return my_string;
}