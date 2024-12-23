#include <iostream>
using namespace std;

bool collinearity(int x1, int y1, int x2, int y2)
{

    if ((x1 == 0 && y1 == 0) || (x2 == 0 && y2 == 0))
    {
        return true;
    }
    else if (x1 == 0 && x2 == 0)
    {
        return true;
    }
    else if ((x1 == 0 && x2 != 0) || (x2 == 0 && x1 != 0))
    {
        return false;
    }
    else if ((y1 * x2) ==  (y2 * x1))
    {
        return true;
    }

    return false;
}

int main()
{
   if(collinearity(2, 4, -4, 8))
   {
    cout<<"lines are colinear."<<endl;
   }
   else
   {
    cout<<"lines are not colinear."<<endl;
   }
}