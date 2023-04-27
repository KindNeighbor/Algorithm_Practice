#include <string>
#include <vector>

using namespace std;

int solution(int a, int b) {
    string as = to_string(a);
    string bs = to_string(b);
        
    string ab = as + bs;
    string ba = bs + as;
        
    int intAB = stoi(ab);
    int intBA = stoi(ba);
    
    if (intAB == intBA) {
        return intAB;
    } else if (intAB > intBA) {
        return intAB;
    } else {
        return intBA;
    }
}