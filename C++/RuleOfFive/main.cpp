// Testing the Rule of 5
// Copy constuctor, copy assignment opeator, destructor
// Move copy constructor, move assignment operator

#include <iostream>
#include "toy_box.h"

using namespace std;

ToyBox makeToybox(string toy1, string toy2, string toy3) {
	string toys[] = {toy1, toy2, toy3};
	ToyBox t (toys, 3);
	return t;
}

int main(int argc, char** argv) {
    string toys[] = {"ball", "bat", "car", "jacks"};
    string moreToys[] = {"doll house", "fire truck", "pinwheel"};

    ToyBox jasonsToys (toys, 4); // overloaded constructor
    cout << jasonsToys << endl; // overloaded inerstion operator

    ToyBox sallysToys (jasonsToys); // copy constructor
    cout << sallysToys << endl;

    ToyBox ricksToys; // default constructor
    ricksToys = sallysToys; // copy assignment operator
    cout << ricksToys << endl;

    ToyBox ellasToys (moreToys, 3);
    cout << ellasToys << endl;

    ToyBox bradysToys = ToyBox{ellasToys + ricksToys}; // move copy constuctor
    cout << bradysToys << endl;

    ToyBox harrysToys;
    harrysToys = jasonsToys + makeToybox("baby doll", "yo-yo", "marbles"); // move assignment operator
    cout << harrysToys << endl;

    return 0;
}