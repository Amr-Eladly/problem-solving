#include <iostream>

using namespace std;
int main()
{
    int n, k;
    cin >> n >> k;
    char alphabets[26];
    int i = 0;
    for (char c = 'a'; c <= 'z'; c++)
    {
        if (i < k)
        {
            alphabets[i] = c;
            i++;
        }
        else
        {
            break;
        }
    }
    for (i = 0; i < n; i++)
    {
        if (i < k)
        {
            cout << alphabets[i];
        }
        else
        {
            cout << alphabets[i%k];
        }
    }
    return 0;
}