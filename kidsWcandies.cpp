#include <iostream>
#include <vector>
#include <cmath>
using namespace std;

bool maxNoAdjFlowers(vector<int> &flowerbed, int n)
{
    int size = flowerbed.size();
    float x = size/2;
    int k = ceil(x);
    int cnt = 0;
    for (int i = 0; i <= flowerbed.size(); i++)
    {
        if (flowerbed[i] == 1)
            cnt += 1;
    }
    if (n <= k - cnt)
    {
        return true;
    }
    return false;
}
int main()
{
    return 0;
}