package Sets;

import java.util.HashSet;

public class ST003PairExist {
    public static void main(String[] args) {
        int arr[]={8,4,12,20};
        int k=8;
        System.out.println(solve(arr, k));
    }
    public static boolean solve(int []arr,int k){
        int n=arr.length;
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int i=0;i<n;i++){
            if(hs.contains(k-arr[i])){
                return true;
            }
            else hs.add(arr[i]);
        }
        return false;
        
    }
}
