package Sets;

import java.util.HashMap;

public class HM002PairDuplicate {
    public static void main(String[] args) {
        int arr[]={3,5,2,3,6,5,5,2,3};
        solve(arr);
    }
    public static int factorial(int n){
        if(n==0) return 1;
        if(n==1) return 1;
        return n*factorial(n-1);
    }
    public static void solve(int []arr){
        int n=arr.length;
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();

        for(int i=0;i<n;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }else{
                hm.put(arr[i],1);
            }
        }
        final int[] count = {0};
        
        hm.forEach((key, value) -> {
            System.out.println("Key: " + key + ", Value: " + value);
            count[0] += (value * (value - 1) / 2);
        });
        
        System.out.println("Total count: " + count[0]);
    }
}
