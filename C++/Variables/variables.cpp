// Variables

#include <iostream>
#include <climits>

using namespace std;

int main(int argc, char** argv) {
    int x; // variable declaration
    x = 7; // variable initialization/assignment

    // vailid types of declarations and initializations
    int y(45);
    int z = {57864};
    int a {5634};
    int b = {}; // initialize to 0
    int c {}; // initialize to 0

    c {65};

    short s = 34;
    int i = 50;
    long l = 464234;
    long long ll = -456456334539;

    unsigned short us = 453;
    unsigned int ui = 435;
    unsigned long ul = 634535;
    unsigned long long ull = 346345354253;

    // full list of climits variables available at <http://www.cplusplus.com/reference/climits/>
    int maxInt = INT_MAX; // from the climits header file

    return 0;
}