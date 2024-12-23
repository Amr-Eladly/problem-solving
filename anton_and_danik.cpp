#include <iostream>
#include <string.h>
using namespace std;
string chess_game(int n)
{
    cin >> n;
    char winner[n];
    int A_count = 0;
    int D_count = 0;
    for (int i = 0; i < n; i++)
    {
        cin >> winner[i];
        if (winner[i] == 'A')
        {
            A_count += 1;
        }
        else
        {
            D_count += 1;
        }
    }
    string result;
    if (D_count == A_count)
    {
        cout << "Friendship";
    }
    else if (D_count > A_count)
    {
        cout << "Danik";
    }
    else
    {
        cout << "Anton";
    }
    return result;
}

int main()
{
    int numberOfGames;
    chess_game(numberOfGames);
}