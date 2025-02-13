#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin>>n;
    vector<int> arr(n);
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    vector<int> evenArr(n);
    for(int i=0;i<n;i++){
        if(arr[i]%2==0){
            evenArr[i]=1;
        }
        if(i>0){
            evenArr[i]+=evenArr[i-1];
        }
    }
    int q;
    cin>>q;
    vector<pair<int,int>> queries(q);
    for(int i=0;i<q;i++){
        int l,r;
        cin>>l>>r;
        queries[i]={l,r};
    }
    for(int i=0;i<q;i++){
        int l=queries[i].first;
        int r=queries[i].second;
        int ans=evenArr[r]-evenArr[l-1];
        cout<<ans<<endl;
    }

    return 0;
}