#include <iostream>
#include <string>
using namespace std;

void magnets()
{
    int magnets_number;
    cin >> magnets_number;
    string magnets[magnets_number];
    int sets_counter = 0;
    for (int i = 0; i < magnets_number; i++)
    {
        cin >> magnets[i];
        if (magnets[i] != magnets[i - 1])
        {
            sets_counter += 1;
        }
    }
    cout<< sets_counter;
}

int main(){
    magnets();
    return 0;
}