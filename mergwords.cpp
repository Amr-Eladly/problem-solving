#include <iostream>
#include <cstring>
using namespace std;

string mergeAlternately(const string &word1, const string &word2)
{
    int k = max(word1.size(), word2.size());
    string res;
    for (int i = 0; i < k; i++)
    {
        if (i < word1.size())
            res += word1[i];
        if (i < word2.size())
            res += word2[i];
    }
    cout << res;
    return res;
}

int main()
{
    char word1[] = "abcd efgh ijk";
    char word2[] = "xxxxxxxx";
    mergeAlternately(word1, word2);
    return 0;
}