#include <iostream>
using namespace std;
void problems_number(int n)
{
    cin >> n;
    int p, v, t, counter = 0;
    for (int i = 0; i < n; i++)
    {
        cin >> p >> v >> t;
        if (p + v + t >= 2)
        {
            counter++;
        }
    }
    cout << counter;
}

int main()
{
    int problemsNum;
    problems_number(problemsNum);
    return 0;
}