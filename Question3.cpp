#include <iostream>
using namespace std;
class Rectangle {
private:
    double length;
    double width;
public:
    Rectangle() {
        length = 1.0; 
        width = 1.0;  
        cout << "No-argument constructor called. Default Length: " << length << ", Default Width: " << width << endl;
    }
    Rectangle(double side) {
        length = side;
        width = side; 
        cout << "One-argument constructor called. Length: " << length << ", Width: " << width << endl;
    }
    Rectangle(double l, double w) {
        length = l;
        width = w;
        cout << "Two-argument constructor called. Length: " << length << ", Width: " << width << endl;
    }
    Rectangle(const Rectangle &rect) {
        length = rect.length;
        width = rect.width;
        cout << "Copy constructor called. Length: " << length << ", Width: " << width << endl;
    }
    double area() {
        return length * width;
    }
};
int main() {
    Rectangle rect1; 
    Rectangle rect2(5.0); 
    Rectangle rect3(4.0, 6.0); 
    Rectangle rect4(rect3); 
    cout << "Area of rect1: " << rect1.area() << endl;
    cout << "Area of rect2: " << rect2.area() << endl;
    cout << "Area of rect3: " << rect3.area() << endl;
    cout << "Area of rect4 (copy of rect3): " << rect4.area() << endl;
    return 0;
}
