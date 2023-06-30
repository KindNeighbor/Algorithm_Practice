#include <iostream>
using namespace std;

int main() {
    int A, B, C;
    cin >> A >> B >> C;
    
    int a = A * 60 + B + C;
    A = a / 60; 
    B = a % 60;
    
    if(A>=24) A = A-24;
    cout << A << " " << B;
    return 0;
}