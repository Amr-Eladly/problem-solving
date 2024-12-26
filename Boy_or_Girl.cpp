#include <iostream>
#include <vector>
using namespace std;

void boy_or_girl()
{
    string username;
    cin >> username;
    vector<bool> seen(26, false); 
    int distinctCount = 0;

    for (int i = 0; i < username.length(); ++i)
    {
        if (!seen[username[i] - 'a']) { 
            seen[username[i] - 'a'] = true;
            distinctCount++;
        }
    }

    if (distinctCount % 2 == 0) {
        cout << "CHAT WITH HER!";
    } else {
        cout << "IGNORE HIM!";
    }
}
int main()
{
    boy_or_girl();
    return 0;
}


/*  Another way of doing it
#include <iostream>
#include <set>
using namespace std;

void boy_or_girl()
{
    string username;
    cin >> username;
    set<char> unique_chars; 
    int distinctCount = 0;

    for(char ch : username){
        unique_chars.insert(ch);
    }

    if (unique_chars.size() % 2 == 0) {
        cout << "CHAT WITH HER!";
    } else {
        cout << "IGNORE HIM!";
    }
}

int main()
{
    boy_or_girl();
    return 0;
}
*/