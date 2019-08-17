// User Input with cin
// cin uses ' ' as delimiter

#include <iostream>

using namespace std;

string getUser(string thing);
string createGreeting(string name, string age, string color);

int main() {
    string name = getUser("name");
    string age = getUser("age");
    string color = getUser("favorite color");
    string greeting = createGreeting(name, age, color);
    cout << greeting << endl;
    return 0;
}

string getUser(string thing) {
    string userThing = "";
    cout << "What is your " + thing + "? ";
    cin >> userThing;
    return userThing;
}

string createGreeting(string name, string age, string color) {
    string greeting = "Hello. ";
    greeting += "My name is " + name + ". ";
    greeting += "I am " + age + " years old. ";
    greeting += "My favorite color is " + color + ".";
    return greeting;
}
