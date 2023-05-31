#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(vector<string> wallpaper) {
    int xMin = 51;
    int yMin = 51;
    int xMax = -1;
    int yMax = -1;
    for (int i = 0; i < wallpaper.size(); i++) {
        for (int j = 0; j < wallpaper[i].size(); j++) {
            if (wallpaper[i][j] == '#') {
                xMin = min(i,xMin);
                yMin = min(j,yMin);
                xMax = max(i+1,xMax);
                yMax = max(j+1,yMax);
                
            }
        }
    }
    
    vector<int> v;
    v.resize(4);
    v[0] = xMin; v[1] = yMin; v[2] = xMax; v[3] = yMax;
    return v;
}