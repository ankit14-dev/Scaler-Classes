#include<bits/stdc++.h>
using namespace std;
int main(){
    
    int n,sum;
    vector<int> arr={1,2,3,4};
    vector<int> cummulativeSum(n);
    for(int i=0;i<n;i++){
        cummulativeSum[i]=arr[i];
        if(i>0){
            cummulativeSum[i]+=cummulativeSum[i-1];
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
        int ans=cummulativeSum[r]-cummulativeSum[l-1];
    }

    return 0;
}