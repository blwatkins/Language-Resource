#ifndef __dog_h__
#define __dog_h__

#include "animal.h"

class Dog: public Animal { // class Dog inherits from Animal
private:
    string furColor;

protected:

public:
    Dog();
    Dog(string name, int age, string furColor);
    ~Dog();

    virtual void makeNoise();
    virtual void walk();
    virtual void eat();
    void sleep();
    void wakeUp();
};

#endif