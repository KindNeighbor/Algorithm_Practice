#include <string>
#include <vector>

using namespace std;

string solution(string code) {
    string s = "";
    int mode = 0;
    for (int i = 0; i < code.length(); i++) {
        if (mode == 0) {
            if (code[i] == '1') {
                mode = 1;
            } else {
                if (i % 2 == 0) {
                    s += code[i];
                }
            }
        } else if (mode = 1) {
           if (code[i] == '1') {
                mode = 0;
            } else {
                if (i % 2 != 0) {
                    s += code[i];
                }
            } 
        }
    }
    
    if (s == "") {
        return "EMPTY";
    } else {
        return s;
    }
}