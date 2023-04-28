#include <string>
#include <iostream>

using namespace std;

int main() {
    float grade;
    float score;
    string s;
    double avg;
    double scoreSum = 0;
    double gradeSum = 0;
    string major;
    for (int i = 0; i < 20; i++) {
        cin >> major >> grade >> s;
        if (s == "A+") score = 4.5;
        else if (s == "A0") score = 4.0;
        else if (s == "B+") score = 3.5;
        else if (s == "B0") score = 3.0;
        else if (s == "C+") score = 2.5;
        else if (s == "C0") score = 2.0;
        else if (s == "D+") score = 1.5;
        else if (s == "D0") score = 1.0;
        else if (s == "F") score = 0.0;
        else if (s == "P") {
            score = 0.0;
            grade = 0;
        }
        
        scoreSum += grade * score;
        gradeSum += grade;
    }
    
    avg = scoreSum / gradeSum;
    cout << fixed;
	cout.precision(6);
	cout << avg;
}