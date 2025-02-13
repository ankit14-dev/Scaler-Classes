package Sets;

import java.util.HashMap;

public class HM007SubArrayWithSumZero {

    public static void main(String[] args) {
        int a[]={-5,7,4,5,-2,1,-3,-2,1,8};
        int b[]={7,-3,-2,1,-3,4,5,10,-7};
        int[] pSum=prefixSum(a);
        int[] pSum2=prefixSum(b);
        // Print(a);
        // Print(pSum);
        // Print(b);
        Print(pSum2);

        // HashMap<Integer,Integer> hm=new HashMap<>();
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
        for(int i:hm.keySet()){
            System.out.println(i+" "+hm.get(i));
        }
        return hm;
    }
    public static void Print(int[] a){
        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.println();
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