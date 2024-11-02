#include <iostream>
using namespace std;
void callByValue(int a) {
    a = a + 10;
    cout << "Inside callByValue - a: " << a << endl;
}
void callByReference(int &a) {
    a = a + 10;
    cout << "Inside callByReference - a: " << a << endl;
}
void swapByReference(int &a, int &b) {
    int temp = a;
    a = b;
    b = temp;
    cout << "Inside swapByReference - a: " << a << ", b: " << b << endl;
}
int main() {
    int a,b;
    cout<<"Enter the value of a and b"<<endl;
    cin>>a >>b;
    cout << "Before callByValue - a: " << a << endl;
    callByValue(a);
    cout << "After callByValue - a: " << a << endl;
    cout << "\nBefore callByReference - a: " << a << endl;
    callByReference(a);
    cout << "After callByReference - a: " << a << endl;
    cout << "\nBefore swapByReference - a: " << a << ", b: " << b << endl;
    swapByReference(a, b);
    cout << "After swapByReference - a: " << a << ", b: " << b << endl;
    return 0;
}
