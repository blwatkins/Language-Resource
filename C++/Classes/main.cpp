// Declare, Insantiate, and Output Objects

#include <iostream>
#include "dog.h"

using namespace std;

int main(int argc, char** argv) {
    BW::Dog lassie; // default constuctor
    cout << lassie << endl; // output object
    lassie.speak(); // method call

    cout << endl;

    BW::Dog spot("spot", 2, 5.6); // overloaded constructor
    cout << spot << endl; // overloarded insertion operator
    spot.speak();

    cout << endl;

    // pointers
    BW::Dog* fluffy = new BW::Dog("fluffy", 3, 9.6);
    cout << *fluffy << endl;
    fluffy->speak(); // pointer -> arrow notation
    (*fluffy).speak(); // dereferenced pointer ==> object -> dot notation
    
    cout << endl;
    
    BW::Dog pongo;
    cin >> pongo; // overloaded extraction operator
    cout << pongo << endl;
    pongo.speak();

    delete fluffy;
    return 0;
}