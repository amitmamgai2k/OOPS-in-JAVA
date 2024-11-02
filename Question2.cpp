#include <iostream>
using namespace std;
double calculateSimpleInterest(double principal, double time, double rate = 5.0) { // Default rate is 5%
    return (principal * rate * time) / 100;
}
int main() {
    double principal, time, rate;
    cout << "Enter the principal amount: ";
    cin >> principal;
    cout << "Enter the time period in years: ";
    cin >> time;
    char choice;
    cout << "Do you want to enter a custom rate of interest? (y/n): ";
    cin >> choice;
    if (choice == 'y' || choice == 'Y') {
        cout << "Enter the rate of interest: ";
        cin >> rate;
        double interest = calculateSimpleInterest(principal, time, rate);
        cout << "The simple interest is: " << interest << endl;
    } else {
        double interest = calculateSimpleInterest(principal, time);
        cout << "The simple interest with default rate is: " << interest << endl;
    }
    return 0;
}
