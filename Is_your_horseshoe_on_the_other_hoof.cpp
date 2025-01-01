#include <iostream>
#include<set>
using namespace std;

int main(){
    set<int> unique_colors;
    for(int i=0; i<4; i++){
        int x;
        cin>>x;
        unique_colors.insert(x); 
    }
    cout<< 4-unique_colors.size();
    return 0;
    
}