#include <iostream>
#include <cstring>
using namespace std;
int main()
{
    string string1;
    string string2;
    cin >> string1;
    cin >> string2;
    for (auto &x : string1)
    {
        x = tolower(x);
    }
    for (auto &x : string2)
    {
        x = tolower(x);
    }

    if (string1.compare(string2) == 0)
    {
        cout << "0";
    }
    else
    {
        for (int i = 0; i < string1.size(); i++)
        {
            if (string1.at(i) < string2.at(i))
            {
                cout << "-1";
                break;
            }
            else if (string1.at(i) > string2.at(i))
            {
                cout << "1";
                break;
            }
        }
    }

    return 0;
}