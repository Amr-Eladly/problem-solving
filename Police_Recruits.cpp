#include <iostream>
using namespace std;

void untreated_crimes()
{
    int n;
    cin >> n;
    int events[n];
    int sum = 0;
    int counter = 0;
    for (int i = 0; i < n; i++)
    {
        cin >> events[i];
        sum += events[i];
        if (sum < 0)
        {
            counter++;
            sum = 0;
        }
    }
    cout << counter;
}

int main(){
    untreated_crimes();
    return 0;
}