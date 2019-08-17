#ifndef __animal_h__
#define __animal_h__

#include <iostream>

using namespace std;

class Animal {
private:

protected:
    string name;
    int age;

public:
    Animal();
    Animal(string name, int age);
    virtual ~Animal();

    // virtual functions are bound to a method at run-time
    virtual void makeNoise(); // virtual function; can be overidden by subclasses
    virtual void walk();
    virtual void eat() = 0; // pure virtual function; makes class abstract
    void sleep();
    void wakeUp();


    string getName();
    int getAge();

    void setName(string name);
    void setAge(int age);

};

#endif