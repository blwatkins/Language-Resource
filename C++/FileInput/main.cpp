// Input Text from a File

#include <iostream>
#include <fstream>
#include <vector>

using namespace std;

vector<string> getLinesFromFile(string filename);
vector<string> getWordsFromFile(string filename);
void printVector(const vector<string>& v, string bullet);

int main() {
    vector<string> lines = getLinesFromFile("test.txt");
    cout << "Text Lines: " << endl;
    printVector(lines, "    ");

    vector<string> words = getWordsFromFile("test.txt");
    cout << "Words: " << endl;
    printVector(words, "  - ");

    return 0;
}

vector<string> getLinesFromFile(string filename) {
    ifstream input;
    vector<string> text;
    input.open(filename.c_str(), ifstream::in);

    if (input.is_open() && input.good()) {
        string buffer;

        while (input.good()) {
            getline(input, buffer);
            text.push_back(buffer);
        }

    }

    input.close();
    return text;
}

vector<string> getWordsFromFile(string filename) {
    ifstream input;
    vector<string> text;
    input.open(filename.c_str(), ifstream::in);

    if (input.is_open() && input.good()) {
        string buffer;

        while(!input.eof()) {
            input >> buffer;
            text.push_back(buffer);
        }

    }

    input.close();
    return text;
}

void printVector(const vector<string>& v, string bullet) {

    for (int i = 0; i < v.size(); i++) {
        cout << bullet << v.at(i) << endl;
    }

    cout << endl;
}
