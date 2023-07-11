#include<iostream>
using namespace std;
int recursive()
{
    int n=1;
    cout<<"20sw060";
    if(n<6)
    {   n++;
        return recursive();
    }
}

int main()
{
    cout<<recursive();
}