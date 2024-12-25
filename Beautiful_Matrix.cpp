#include <iostream>
#include <cmath>
using namespace std;

int shiftsNum()
{
    int matrix[5][5];
    int row, col;
    for (int i = 0; i < 5; i++)
    {
        for (int j = 0; j < 5; j++)
        {
            cin >> matrix[i][j];
            if (matrix[i][j] == 1)
            {
                row = i+1;
                col = j+1;
            }
        }
    }
    int col_diff = 3 - col;
    int row_diff = 3 - row;
    int shiftsNumber = abs(col_diff) + abs(row_diff);
    cout << shiftsNumber;
    return shiftsNumber;
}

int main(){
    shiftsNum();
    return 0;
}