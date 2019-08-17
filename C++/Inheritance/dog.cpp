#include "dog.h"

Dog::~Dog() {
    cout << "Dog destructor" << endl;
}

Dog::Dog():
Animal(), furColor("") { // call superclass constructor in initialization list
}

Dog::Dog(string name, int age, string furColor): // call superclass constructor in initialization list
Animal(name, age), furColor(furColor) {
}

void Dog::makeNoise() {
    cout << "Bark" << endl;
}

void Dog::walk() {
    cout << "A dog is walking" << endl;
    sleep();
}

void Dog::eat() {
    cout << "Eat dog food" << endl;
}

void Dog::sleep() {
    cout << "A dog is sleeping" << endl;
}

void Dog::wakeUp() {
    cout << "A dog is waking up" << endl;
    makeNoise();
}
