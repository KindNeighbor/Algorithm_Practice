#include <iostream>
#include <cmath>
#include <algorithm>

using namespace std;

class Point{
public:
    double x, y;
};

Point a, b, c;
double abLen, bcLen, acLen, l1, l2, l3;

double getL(Point a, Point b) {
    double x = a.x - b.x;
    double y = a.y - b.y;
    return sqrt(x*x + y*y);
}

double getInc(Point a, Point b) {
    if (a.x == b.x) return 1e9;
    else return (a.y - b.y) / (a.x - b.x);
}

int main() {
    ios_base::sync_with_stdio(false); 
    cout.tie(NULL); 
    cin.tie(NULL);
    
    cin >> a.x >> a.y >> b.x >> b.y >> c.x >> c.y;
    if (getInc(a, b) == getInc(b, c)) {
        cout << "-1.0";
        return 0;
    }
    
    abLen = getL(a, b);
    bcLen = getL(b, c);
    acLen = getL(a, c);
    
    l1 = (abLen + bcLen) * 2;
    l2 = (acLen + bcLen) * 2;
    l3 = (abLen + acLen) * 2;
    
    cout << fixed;
    cout.precision(16);
    
    cout << max(l1, max(l2, l3)) - min(l1, min(l2, l3)) << '\n';
    return 0;
}