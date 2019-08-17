#include <iostream>

using namespace std;

class Toy {

private:
    string name;

public:
    Toy():
    name("") {}

    Toy(string name){
        this->name = name;
    }

    string getName() {
        return name;
    }
};

class ToyBox {

private:  
    Toy* toys[5];
    int numToys;

public:
    ToyBox() {
        numToys = 0;
    }

    ~ToyBox(){

        for (int i = 0; i < numToys; i++) {
            delete toys[i];
        }

    }

    void addToy(string name) {

        if (numToys < 5) {
            toys[numToys] = new Toy(name);
            numToys++;
        }

    }

    Toy* getToy(int index) {
        Toy* toy = nullptr;

        if (index < numToys) {
            toy = toys[index];
        }

        return toy;
    }

    string toString() {
        string output = "TOY BOX:\n";

        for (int i = 0; i < numToys; i++) {
            output += "    TOY " + to_string(i + 1) + " " + toys[i]->getName() + "\n";
        }

        return output;
    }

};

class Toddler {
private:
    string name;
    int age;
    ToyBox toyBox;

public:
    Toddler():
    name(""), age(0) {}

    Toddler(string name, int age): 
    name(name), age(age) {}

    ToyBox& getToyBox() {
        return toyBox;
    }

    void printToyBoxAddress() {
        cout << &toyBox << endl;
    }

};

int main() {
    Toddler timmy("Timmy", 3);
    ToyBox& t = timmy.getToyBox();
    cout << &t << endl;
    timmy.printToyBoxAddress();

    t.addToy("yo-yo");
    timmy.getToyBox().addToy("teddy bear");

    cout << t.toString() << endl;
    cout << timmy.getToyBox().toString() << endl;

    return 0;
}