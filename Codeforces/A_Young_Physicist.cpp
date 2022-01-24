#include<iostream>
using namespace std;
int main()
{
    int i,n,a,b,c,s=0,t=0,u=0;
    cin>>n;
    for(i=0;i<n;i++)
    {
        cin>>a>>b>>c;
        s+=a;
        t+=b;
        u+=c;
    }
    if(s==0 && t==0 && u==0) cout<<"YES"<<endl;
    else cout<<"NO"<<endl;
    return 0;
    
}