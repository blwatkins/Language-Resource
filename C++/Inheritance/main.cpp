#include <iostream>
#include "animal.h"
#include "dog.h"

using namespace std;

int main (int argc, char** argv) {
    cout << "Dog a;" << endl;
    Dog a;
    a.makeNoise();
    a.eat();
    a.walk();
    a.sleep();
    a.wakeUp();
    cout << endl;

    // pointers must be used for inheritance to work
    cout << "Animal* b = new Dog();" << endl;
    Animal* b = new Dog();
    b->makeNoise();
    b->eat();
    b->walk();
    b->sleep();
    b->wakeUp();
    cout << endl;

    delete b;
    return 0;
}