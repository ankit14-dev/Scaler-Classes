package Sets;

import java.util.HashMap;

public class HM005FindFirstNonRepeatingElement {
    public static void main(String[] args) {
        int a[]={3,1,2,1,5,6,2};
    int n=a.length;
    HashMap<Integer,Integer> hm=new HashMap<>();

    for(int i=0;i<n;i++){
        if(hm.containsKey(a[i])){
            hm.put(a[i],hm.get(a[i])+1);
        }else{
            hm.put(a[i], 1);
        }
    }
    for(int i=0;i<n;i++){
        if(hm.get(a[i])==1){
            System.out.println(a[i]);
            return;
        }
    }
    }
}
