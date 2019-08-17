#include "dog.h"

using namespace BW;

namespace BW {
    ostream& operator<<(ostream& out, const Dog& d) {
        out << "Dog:" << endl;
        out << "  @" << &d << endl;
        out << "  name = " << d.getName() << endl;
        out << "  age = " << d.getAge() << endl;
        out << "  weight = " << d.getWeight();
        return out;
    }

    istream& operator>>(istream& in, Dog& d) {
        string name = "";
        int age = -1;
        float weight = -1;

        cout << "What is the dog's name? ";
        in >> name;
        d.setName(name);

        cout << "What is " << d.getName() << "'s age? ";
        in >> age;
        d.setAge(age);

        cout << "What is " << d.getName() << "'s weight? ";
        in >> weight;
        d.setWeight(weight);

        return in;
    }
}

Dog::Dog():
name(""), age(0), weight(0) {
}

Dog::Dog(string name, int age, float weight):
name(name), age(age), weight(weight) {
}

void Dog::speak() {
    cout << "Bark!" << endl;
}