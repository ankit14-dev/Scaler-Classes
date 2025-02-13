package Sets;

import java.util.ArrayList;
import java.util.HashMap;

public class HM006ReturnCountOfDistinctElementInSubArray {
    public static void main(String[] args) {
        int a[]={3,2,1,3,5,6,2,5,5,7};
        int k=4;
        int n=a.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<k;i++){
            if(hm.containsKey(a[i])){
                hm.put(a[i],hm.get(a[i])+1);
            }else{
                hm.put(a[i], 1);
            }
        }
        ArrayList<Integer> al=new ArrayList<>();
        al.add(hm.size());

        for(int i=k;i<n;i++){
            if(hm.get(a[i-k])==1){
                hm.remove(a[i-k]);
            }else{
                hm.put(a[i-k],hm.get(a[i-k])-1);
            }
            if(hm.containsKey(a[i])){
                hm.put(a[i],hm.get(a[i])+1);
            }else{
                hm.put(a[i], 1);
            }
            al.add(hm.size());
        }
        for(int i:al){
            System.out.println(i);
        }
    }
}
