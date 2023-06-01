#include <iostream>
#include <string>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    string s1 = "";
    string s2 = "";
    string s3 = "";
    cin >> s1 >> s2;
    
    int l1 = s1.length();
    int l2 = s2.length();
    
    for (int i = 0;  i < l1; i++) {
        s3 += s1[i];
        if (s3.length() >= l2) {
            bool check = true;
            for (int j = 0; j < l2; j++) {
                if (s3[s3.length() - l2 + j] != s2[j]) {
                    check = false;
                    break;
                }
            }
            if (check) {
                s3.erase(s3.end() - l2, s3.end());
            }
        }
    }
    
    if (s3 == "") {
        cout << "FRULA";
    } else {
        cout << s3;
    }
    
    return 0;
}