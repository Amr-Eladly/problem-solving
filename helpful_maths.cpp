#include <iostream>
#include <cstring>
#include <vector>
#include <algorithm>

using namespace std;
int main()
{
    string sequence;
    cin >> sequence;
    int counter = 0;
    vector<int> numbers;
    for (char c : sequence)
    {
        if (c == '+')
        {
            counter += 1;
        }
        else
        {
            numbers.push_back(c - '0');
        }
    }
    sort(numbers.begin(), numbers.end());
    for (int i : numbers)
    {
        if (counter > 0)
        {
            cout << i << "+";
            counter--;
        }
        else
        {
            cout << i;
        }
    }
    return 0;
}