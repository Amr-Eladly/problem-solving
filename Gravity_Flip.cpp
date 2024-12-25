#include <iostream>
using namespace std;

void gravityFlip(int n) //ascending order
{
    cin >> n;
    int cols[n];
    for (int i = 0; i < n; i++)
    {
        cin >> cols[i];
    }

    for (int i = 0; i < n; i++){
        int temp;
        for (int j = i+1; j < n; j++){
            if(cols[i] > cols[j]){
                temp = cols[i];
                cols[i] = cols[j];
                cols[j]= temp;
            }
        }
    }
    
    for (int i = 0; i < n; i++)
    {
        cout << cols[i] << " ";
    }
}

int main()
{
    int n;
    gravityFlip(n);
    return 0;
}
