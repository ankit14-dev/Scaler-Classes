package Sets;

import java.util.HashMap;

public class HM003CountPairSum {
    public static void main(String[] args) {
        int arr[]={2,3,7,5,4,5,6,8,6};
        int k=10;
        System.out.println(solve(arr,k));
    }
    public static int solve(int []arr,int k){
        int count=0;
        int n=arr.length;
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(k-arr[i])){
                count+=hm.get(k-arr[i]);
            }
            if(hm.containsKey(arr[i])){                
                hm.put(arr[i],hm.get(arr[i])+1);
            }else{
                hm.put(arr[i],1);
            }
        }
        /* hm.forEach((key, value) -> {
            System.out.println("Key: " + key + ", Value: " + value);
        }); */

        // for(int i=0;i<n;i++){
        //     if(hm.containsKey(k-arr[i])){
        //         count+=hm.get(arr[i])*hm.get(k-arr[i]);
        //         hm.remove(arr[i]);
        //         hm.remove(k-arr[i]);
        //     }
        // }
        return count;
    }
}
