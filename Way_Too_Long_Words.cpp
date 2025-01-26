#include <iostream>
#include <vector>
using namespace std;

int main()
{
    int n;
    cin >> n;
    vector<string> words;
    for (int i = 0; i < n; i++)
    {
        string s;
        cin >> s;
        words.push_back(s);
    }

    for (string s : words)
    {
        if (s.length() > 10)
        {
            cout << s[0] << s.length() - 2 << s.back() << endl;
        }
        else
        {
            cout << s << endl;
        }
    }

    return 0;
}