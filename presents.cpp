#include <iostream>

using namespace std;
int main()
{
    int numberOfFriends;
    cin >> numberOfFriends;

    int parteners [numberOfFriends];
    int p;
    for (int i = 0; i < numberOfFriends; i++)
    {
        cin >> p;
        parteners[i] = p;
    }

    for (int i = 1; i <= numberOfFriends; i++)
    {
        for (int j = 0; j < numberOfFriends; j++)
        {
            if(parteners[j] == i) { cout<< j+1<< " ";}
        }
    }

    return 0;
}
