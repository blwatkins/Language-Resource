// lvalue References

#include <iostream>

using namespace std;

int main(int argc, char** argv) {
    // integer reference
    int n = 0;
    int& rn = n;
    n = 20; // changes value of variable and reference
    cout << "n = " << n << " @ " << &n << "; rn = " << rn << " @ " << &rn << endl;
    rn = 15; // changes value of variable and reference
    cout << "n = " << n << " @ " << &n << "; rn = " << rn << " @ " << &rn << endl;

    // pointer reference
    int* pt = new int;
    int& rt = *pt;
    *pt = 16; // changes value of variable and reference
    cout << "*pt = " << *pt << " @ " << pt << "; rt = " << rt << " @ " << &rt << endl;
    rt = 23; // changes value of variable and reference
    cout << "*pt = " << *pt << " @ " << pt << "; rt = " << rt << " @ " << &rt << endl;

    // const integer reference - value cannot be modified
    const int b = 100;
    const int& rb = b; 
    cout << "b = " << b << " @ " << &b << "; rb = " << rb << " @ " << &rb << endl;

    delete pt;
    return 0;
}
