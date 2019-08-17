#include "animal.h"

Animal::Animal():
name(""), age(0) {
}

Animal::Animal(string name, int age):
name(name), age(age) {
}

Animal::~Animal() {
    cout << "Animal destructor" << endl;
}

void Animal::makeNoise() {
    cout << "Make animal noise" << endl;
}

void Animal::walk() {
    cout << "An anmial is walking" << endl;
    sleep();
}

void Animal::sleep() {
    cout << "An animal is sleeping" << endl;
}

void Animal::wakeUp() {
    cout << "An animal is waking up" << endl;
    makeNoise();
}

string Animal::getName(){
    return name;
}

int Animal::getAge() {
    return age;
}

void Animal::setName(string name){
    this->name = name;
}

void Animal::setAge(int age) {
    this->age = age;
}