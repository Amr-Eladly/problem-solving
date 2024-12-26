#include<iostream>
#include<string>
#include<cctype>
using namespace std;

void extention(){
    string word;
    cin>> word;
    int caps_couter = 0;
    for(char ch: word){
        if((ch - 'A')< 26){
            ++caps_couter;
        }
    }
    if(caps_couter> word.size()-caps_couter){
        for(char& ch: word){
            ch = toupper(ch);
        }
        cout<< word;
    } else{
        for(char& ch: word){
            ch = tolower(ch);
        }
        cout<< word;
    }
}
int main(){
    extention();
    return 0;
}