package Sets;

import java.util.HashMap;

public class HM001Frequency {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        int arr[]={3,5,2,3,6,5,5,2,5};
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }else{
                hm.put(arr[i],1);
            }
        }
        hm.forEach((key, value) -> {
            System.out.println("Key: " + key + ", Value: " + value);
        });
    }
}
