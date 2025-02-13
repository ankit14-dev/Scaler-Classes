package BinarySearch;

public class FindSingleInteger {
    public static void main(String[] args) {
        
    }
    public static int search(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            // if(arr[mid]!=arr[mid])
            if(arr[mid]==arr[mid+1]){
                if(mid%2!=0){
                    end=mid-1;
                }
                else{
                    mid=start+1;
                }
            }
            else{
                if(mid%2==0){
                    end=mid-1;
                }
                else{
                    mid=start+1;
                }
            }
        }
    }
}
