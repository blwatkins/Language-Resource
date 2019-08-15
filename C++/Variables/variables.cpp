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
    c = {65};

    short s = 34;
    int i = 50;
    long l = 464234L;
    long long ll = -456456334539LL;

    unsigned short us = 453U;
    unsigned int ui = 435U;
    unsigned long ul = 634535UL;
    unsigned long long ull = 346345354253UL;

    float f = 342.54645F;
    float science = 2.5E-4F;
    double d = 23423.453;
    long double ld = 43545.456L;

    char myChar {'C'};
    string myString {"This is my string"};

    bool myBool {false};

    int maxInt = INT_MAX; // from the climits header file

    cout << "The value of ul is " << ul << endl;

    return 0;
}