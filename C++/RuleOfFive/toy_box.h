#ifndef __toy_box_h__
#define __toy_box_h__

#include <iostream>

using namespace std;

class ToyBox {
private:
    string* toys;
    int size;

public:
    friend ostream& operator<<(ostream& out, const ToyBox& t);

    ToyBox();
    ToyBox(string* toys, int size);
    ToyBox(const ToyBox& t);
    ToyBox(ToyBox&& t);
    ToyBox& operator=(const ToyBox& t);
    ToyBox& operator=(ToyBox&& t);
    ~ToyBox();

    ToyBox operator+(const ToyBox& t) const;

    int getSize() const;
    string* getToys() const;
};

inline int ToyBox::getSize() const {
    return size;
}

inline string* ToyBox::getToys() const {
    return toys;
}

#endif