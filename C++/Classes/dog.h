#ifndef __dog_h__
#define __dog_h__

#include <iostream>

using namespace std;

// creating custom namespace
namespace BW {

    class Dog{
    private:
        string name;
        int age;
        float weight;

    protected:

    public:
        friend ostream& operator<<(ostream& out, const Dog& d); // overloaded insertion operator
        friend istream& operator>>(istream& in, Dog& d);

        // constructors
        Dog();
        Dog(string name, int age, float weight);

        // methods
        void speak();

        // getters
        string getName() const; // const allows methods to be called on const objects
        int getAge() const;
        float getWeight() const;

        // setters
        void setName(string name);
        void setAge(int age);
        void setWeight(float weight);
    };

    // inline function definitions

    inline string Dog::getName() const {
        return name;
    }

    inline int Dog::getAge() const {
        return age;
    }

    inline float Dog::getWeight() const {
        return weight;
    }

    inline void Dog::setName(string name) {
        this->name = name;
    }

    inline void Dog::setAge(int age) {
        this->age = age;
    }

    inline void Dog::setWeight(float weight) {
        this->weight = weight;
    }

}

# endif