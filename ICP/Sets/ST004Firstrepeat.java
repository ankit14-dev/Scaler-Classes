package Sets;

import java.util.HashSet;

public class ST004Firstrepeat {
    public static void main(String[] args) {
        int arr[]={3,1,2,5,3,1,2,9};
    }
    public static int solve(int []arr){
        int n= arr.length;
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int i=0;i<n;i++){
            if(hs.contains(arr[i])){
                return arr[i];
            }
            hs.add(arr[i]);
        }
        return -1;

    }
}
