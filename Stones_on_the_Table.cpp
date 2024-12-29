#include <iostream>
#include <string>
using namespace std;

void stones_number()
{
    int n;
    cin >> n;
    string stones_colors;
    cin >> stones_colors;

    int counter = 0;
    for (int i = 0; i < n - 1; i++)
    {
        if (stones_colors.at(i) == stones_colors.at(i + 1))
        {
            counter++;
        }
    }

    cout << counter;
}
int main()
{
    stones_number();
}