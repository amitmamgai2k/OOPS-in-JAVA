#include <iostream>
using namespace std;
class Animal {
public:
    void speak() {
        cout << "The animal makes a sound." << endl;
    }
};
class Mammal : public Animal {
public:
    void walk() {
        cout << "The mammal walks on land." << endl;
    }
};
class Dog : public Mammal {
public:
    void bark() {
        cout << "The dog barks." << endl;
    }
};
int main() {
    Dog myDog;
    myDog.speak();  // From Animal class
    myDog.walk();   // From Mammal class
    myDog.bark();   // From Dog class
    return 0;
}
