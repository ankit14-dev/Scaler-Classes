package Sets;

import java.util.HashSet;

public class CountDistinctElement {
    public static void main(String[] args) {
        int[] arr={1,7,3,4,95,2,18,22,1,22,2,3,7,95};
        int n=arr.length;
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int i=0;i<n;i++){
            hs.add(arr[i]);
        }
        System.out.println(hs.size());
    }
}
