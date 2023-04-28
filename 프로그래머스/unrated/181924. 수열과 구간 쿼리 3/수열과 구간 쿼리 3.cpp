#include <string>
#include <vector>
#include <iostream>

using namespace std;

vector<int> solution(vector<int> arr, vector<vector<int>> queries) {
    for (int i = 0; i < queries.size(); i++) {
        int a = queries[i][0];
        int b = queries[i][1];
        int c = arr[a];
        int d = arr[b];
        
        arr[a] = d;
        arr[b] = c;
        
    }
    return arr;
}