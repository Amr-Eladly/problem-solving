#include <iostream>
using namespace std;
int width(int n, int h)
{
    cin >> n >> h;
    int a[n];
    int width = 0;
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
        if (a[i] <= h)
        {
            width++;
        }
        else
        {
            width += 2;
        }
    }
    cout<< width;
    return width;
}
int main()
{
    int n;
    int h;
    width(n, h);
}