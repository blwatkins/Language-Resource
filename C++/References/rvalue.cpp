// rvalue Reference

#include <iostream>
#include <cmath>

using namespace std;

int main(int argc, char** argv) {
    // expression reference
    int x = 10;
    int y = 23;
    // int & tr = x + y; // return value is a "temporay int"; cannot bind to lvalue reference
    int && er = x + y;
    cout << "er = " << er << " @ " << &er << endl;
    x = 17; // does not chance value in reference
    cout << "er = " << er << " @ " << &er << endl;

    // literal reference
    // int & r = 14; // will result in error
    int && lr = 13;
    cout << "lr = " << lr << " @ " << &lr << endl;
    lr = 27; // changes value in reference
    cout << "lr = " << lr << " @ " << &lr << endl;

    // function reference
    double && fr = sqrt(2.0);
    cout << "fr = " << fr << " @ " << &fr << endl;

    return 0;
}