#include <iostream>

using namespace std;
/*   O(n2) double for loop method
int main()
{
    int numberOfFriends;
    cin >> numberOfFriends;

    int partners [numberOfFriends];
    int p;
    for (int i = 0; i < numberOfFriends; i++)
    {
        cin >> p;
        partners[i] = p;
    }

    for (int i = 1; i <= numberOfFriends; i++)
    {
        for (int j = 0; j < numberOfFriends; j++)
        {
            if(partners[j] == i) { cout<< j+1<< " ";}
        }
    }

    return 0;
}
*/

// O(n)
#include <vector>

int main()
{
    int n;
    cin >> n;
    vector<int> f(n), p(n); // 2 arrays for the friends and the partners
    for (int i = 0; i < n; i++)
    {
        cin >> f[i];
        p[f[i] - 1] = i + 1;
    }
    for (int i = 0; i < n; i++)
    {
        cout << p[i] << " ";
    }
    return 0;
}