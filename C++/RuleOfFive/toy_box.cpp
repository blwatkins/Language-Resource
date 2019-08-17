#include "toy_box.h"

ostream& operator<<(ostream& out, const ToyBox& t) {
    out << "ToyBox:" << endl;
    out << "  @" << &t << endl;
    out << "  size = " << t.getSize() << endl;
    out << "  toys: " << endl;

    for (int i = 0; i < t.getSize(); i++) {
        out << "    " << *(t.getToys() + i) << endl; 
    }

    return out;
}

ToyBox::ToyBox():
toys(nullptr), size(0) {
    cout << "Default Constructor" << endl;
}

ToyBox::ToyBox(string* toys, int size):
size(size) {
    cout << "Overloaded Constructor" << endl;
    this->toys = new string[size];

    for(int i = 0; i < size; i++) {
        this->toys[i] = toys[i];
    }

}

ToyBox::ToyBox(const ToyBox& t) {
    cout << "Copy Constructor" << endl;
    size = t.getSize();
    toys = new string[size];

    for (int i = 0; i < size; i++) {
        toys[i] = *(t.getToys() + i);
    }

}

ToyBox::ToyBox(ToyBox&& t) {
    cout << "Move Copy Constructor" << endl;
    size = t.getSize();
    toys = t.getToys();

    t.toys = nullptr;
    t.size = 0;
}

ToyBox& ToyBox::operator=(const ToyBox& t) {
    cout << "Copy Assignment Operator" << endl;

    if (this != &t) {
        size = t.getSize();
        delete[] toys;
        toys = new string[size];

        for (int i = 0; i < size; i++) {
            toys[i] = *(t.getToys() + i);
        }  
        
    }

    return *this;
}

ToyBox& ToyBox::operator=(ToyBox&& t) {
    cout << "Move Assignment Operator" <<endl;

    if (this != &t) {
        size = t.getSize();
        delete[] toys;

        toys = t.getToys();

        t.toys = nullptr;
        t.size = 0;
    }

    return *this;

}

ToyBox::~ToyBox() {
    cout << "Destructor" << endl;
    delete[] toys;
    toys = nullptr;
    size = 0;
}

ToyBox ToyBox::operator+(const ToyBox& t) const {
    int total = getSize() + t.getSize();
    string* all_toys = new string[total];

    if (getToys() != nullptr) {

        for (int i = 0; i < getSize(); i++) {
            all_toys[i] = *(getToys() + i);
        }

    }

    if (t.getToys() != nullptr) {

        for (int i = 0; i < t.getSize(); i++) {
            all_toys[getSize() + i] = *(t.getToys() + i);
        }

    }

    ToyBox fullToyBox(all_toys, total);
    return fullToyBox;
}
