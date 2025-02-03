#include <iostream>
#include <cstring>
using namespace std;

int main()
{

    string num1, num2;
    while (cin >> num1)
    {
        cin >> num2;
        int n = num1.length();
        int m = num2.length();
        int product[n + m]; // max size of the product is n+m
        memset(product, 0, sizeof(product)); // set all the digits to be 0 at the beginning 

        for (int i = n - 1; i >= 0; i--)
        {
            for (int j = m - 1; j >= 0; j--)
            {
                int result = (num1[i] - '0') * (num2[j] - '0'); 
                int digit = product[i + j + 1] + result;

                product[i + j + 1] = digit % 10;
                product[i + j] += digit / 10;
            }
        }
        for (int i = 1; i < n + m; i++) // starting from 1 to kick out the zero at the beginning
        {
            cout << product[i];
        }
    }

    return 0;
}