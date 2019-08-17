// Output text to a file

#include <iostream>
#include <fstream>

using namespace std;

string helloWorld(int num);
void truncatingOutput();
void appendingOutput();

int main(int argc, char** argv) {
    truncatingOutput();
    appendingOutput();
    return 0;
}

string helloWorld(int num) {
    string result = "";

    for (int i = 0; i < num; i++) {
        result += "Hello, World.\n";
    }

    return result;
}

void truncatingOutput() { // file contents will be deleted before output
    ofstream output;
    // file will be created if it does not exist
    output.open("truncatingOutput.txt", ofstream::out | ofstream::trunc);
    output << "This is the begining of the output.\n";
    output << helloWorld(2);
    output << "This is the end of the output.\n";
    output.close();
}

void appendingOutput() { // output will be appended to file contents
    ofstream output;
    // file will be created if it does not exist
    output.open("appendingOutput.txt", ofstream::out | ofstream::app);
    output << "This is the begining of the output.\n";
    output << helloWorld(3);
    output << "This is the end of the output.\n\n";
    output.close();
}