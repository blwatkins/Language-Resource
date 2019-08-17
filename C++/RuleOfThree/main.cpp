// Testing the Rule of 3
// Copy constuctor, copy assignment opeator, and destructor

#include <iostream>
#include "toy_box.h"

using namespace std;

int main(int argc, char** argv) {
    string toys[] = {"ball", "bat", "car", "jacks"};

    ToyBox jasonsToys (toys, 4); // overloaded constructor
    cout << jasonsToys << endl; // overloaded inerstion operator

    ToyBox sallysToys (jasonsToys); // copy constructor
    cout << sallysToys << endl;

    ToyBox ricksToys; // default constructor
    ricksToys = sallysToys; // copy assignment operator
    cout << ricksToys << endl;
    return 0;
}