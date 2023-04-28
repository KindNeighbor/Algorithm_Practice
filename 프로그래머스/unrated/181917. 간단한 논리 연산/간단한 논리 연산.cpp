#include <string>
#include <vector>
#include <iostream>

using namespace std;

bool solution(bool x1, bool x2, bool x3, bool x4) {
    bool s1;
    bool s2;
    bool s3;
    if (x1 == true && x2 == false) {
        s1 = true;
    } else if (x1 == false && x2 == true) {
        s1 = true;
    } else if (x1 == false && x2 == false) {
        s1 = false;
    } else if (x1 == true && x2 == true) {
        s1 = true;
    }
    
    if (x3 == true && x4 == false) {
        s2 = true;
    } else if (x3 == false && x4 == true) {
        s2 = true;
    } else if (x3 == false && x4 == false) {
        s2 = false;
    } else if (x3 == true && x4 == true) {
        s2 = true;
    }
    
    
    if (s1 == true && s2 == false) {
        s3 = false;
    } else if (s1 == false && s2 == true) {
        s3 = false;
    } else if (s1 == false && s2 == false) {
        s3 = false;
    } else if (s1 == true && s2 == true) {
        s3 = true;
    }

    return s3;
}