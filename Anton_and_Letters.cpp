#include <iostream>
#include <vector>
#include <set>

using namespace std;

int main()
{
    char ch;
    set<char> unique_chars;
    cin >> ch;
    while (true)
    {
        cin >> ch;

        if (ch == '}')
        {
            break;
        }

        if (ch >= 'a' && ch <= 'z')
        {
            unique_chars.insert(ch);
        }
    }

    cout << unique_chars.size();

    return 0;
}