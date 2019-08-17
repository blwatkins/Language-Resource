// Create and Sort a Vector of Dogs

#include <iostream>
#include <random>
#include <vector>
#include "dog.h"

using namespace std;

vector<Dog> createRandomDogs();
bool descWeight(const Dog& d1, const Dog& d2);
vector<Dog> sortDogs(const vector<Dog>& dogs);
void printVector(const vector<Dog>& v);

int main() {
    cout << "Dogs -------------------------------" << endl;
    vector<Dog> dogs = createRandomDogs();
    printVector(dogs);

    cout << "Sorted Dogs ------------------------" << endl;
    vector<Dog> dogsByWeight = sortDogs(dogs);
    printVector(dogsByWeight);

    return 0;
}

vector<Dog> createRandomDogs() {
    vector<Dog> dogs;
    random_device randomNumber;

    for (int i = 0; i < 5; i++) {
        int age = randomNumber() % 100;
        float weight = (float)(randomNumber() % 500) / (float)(randomNumber() % 100);
        dogs.push_back(Dog(age, weight));
    }

    return dogs;
}

// sorting function
bool descWeight(const Dog& d1, const Dog& d2) {
    return d1.getWeight() > d2.getWeight();
}

vector<Dog> sortDogs(const vector<Dog>& dogs) {
    vector<Dog> sortedDogs = dogs; // copy dogs vector
    // sorts vector in place
    sort(sortedDogs.begin(), sortedDogs.end(), descWeight); // sort(iteratorStart, iteratorEnd, sortFunction)
    return sortedDogs; 
}

void printVector(const vector<Dog>& v) {

    for (int i = 0; i < v.size(); i++) {
        cout << v.at(i) << endl;
    }

}
