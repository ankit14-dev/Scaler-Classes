package Rough;

import java.util.HashMap;

class Rough {

    public static void main(String[] args) {
        int[] arr={-1,8,-4,7,-4,0,-8,-2,-7};
        System.out.println(solve(arr));
    }
    public static int MOD(int n){
        return n%1000000007;
    }
    public static int solve(int[] A) {
        int[] pSum=prefixSum(A);
        int count=0;

        HashMap<Integer,Integer> hm=buildHashMap(pSum);
        if(hm.containsKey(0)){
            count+=hm.get(0);
        }
        for(int i:hm.keySet()){
            if(hm.get(i)>1){
                int temp=hm.get(i);
                temp=MOD(temp);
                count=MOD(MOD(count)+temp*(temp-1)/2);
            }
        }
        return count;
        
    }
    public static HashMap<Integer,Integer> buildHashMap(int[] a){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(hm.containsKey(a[i])){
                hm.put(a[i],hm.get(a[i])+1);
            }else{
                hm.put(a[i],1);
            }
        }
        return hm;
    }
    public static int[] prefixSum(int[] arr){
        int n=arr.length;
        int []prefixSum =new int[n];
        for(int i=0;i<n;i++){
            prefixSum[i]=arr[i];
            if(i>0) prefixSum[i]+=prefixSum[i-1];
        }
        return prefixSum;
    }
}