#ifndef __dog_h__
#define __dog_h__

#include <iostream>

using namespace std;

class Dog {
    private:
        int age;
        float weight;

    public:
        friend ostream& operator<<(ostream& out, const Dog& d);

        Dog();
        Dog(int age, float weight);

        float getWeight() const;
};

#endif