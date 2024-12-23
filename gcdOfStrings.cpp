#include <iostream>
using namespace std;
#include <cstring>

int gcd(int a, int b)
{
    while (b != 0)
    {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

string gcdOfStrings(string str1, string str2)
{
    if (str1 + str2 == str2 + str1)
    {
        int len1 = str1.size();
        int len2 = str2.size();
        int k = gcd(len1, len2);
        return str1.substr(0,k);
    }  
    return "";  
}

int main() {
    string str1, str2;
    cout << "Enter first string: ";
    cin >> str1;
    cout << "Enter second string: ";
    cin >> str2;
    
    string result = gcdOfStrings(str1, str2);
    if (result.empty()) {
        cout << "There is no common divisor string." << endl;
    } else {
        cout << "The GCD of the strings is: " << result << endl;
    }
    
    return 0;
}
