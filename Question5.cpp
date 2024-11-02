#include <iostream>
using namespace std;
class Student {
public:
    virtual void inputMarks() = 0;
    virtual void displayTotalMarks() = 0;
};
class TotalMarks : public Student {
protected:
    int marks1, marks2, marks3;
public:
    void inputMarks() override {
        cout << "Enter marks for Subject 1: ";
        cin >> marks1;
        cout << "Enter marks for Subject 2: ";
        cin >> marks2;
        cout << "Enter marks for Subject 3: ";
        cin >> marks3;
    }
    void displayTotalMarks() override {
        int total = marks1 + marks2 + marks3;
        cout << "Total Marks: " << total << endl;
    }
};
int main() {
    TotalMarks student;
    student.inputMarks();
    student.displayTotalMarks();
    return 0;
}
