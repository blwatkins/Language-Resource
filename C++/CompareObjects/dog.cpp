#include "dog.h"

ostream& operator<<(ostream& out, const Dog& d) {
    out << "Dog: " << endl;
    out << "    " << "age = " << d.age << endl;
    out << "    " << "weight = " << d.weight << endl;
    return out;
}

Dog::Dog():age(5), weight(5.9) {

}

Dog::Dog(int age, float weight): age(age), weight(weight) {

}

float Dog::getWeight() const {
    return weight;
}