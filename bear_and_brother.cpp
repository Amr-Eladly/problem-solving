#include <iostream>
using namespace std;

void neededYears(int a, int b){
    cin>> a >> b;
    int years_count = 0;
    int i = 0;
    while(a <= b){
        a *=3;
        b *=2;
        i += 1;
    }
    cout<< i;
}

int main(){
    int w_Limak,w_Bob;
    neededYears(w_Limak,w_Bob);
    return 0;
}