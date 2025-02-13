package Sets;

import java.util.HashSet;

public class IntersectionOfArray {
    public static void main(String[] args) {
        int arr[]={}
    }
    public static void solve(int arr1[],int[] arr2){
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int i=0;i<arr1.length;i++){
            hs.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            if(hs.contains(arr2[i])){
                System.out.println(arr2[i]);
            }
        }
    }
}