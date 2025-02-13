package BinarySearch;
public class BinarySearch {
    public static void main(String[] args) {
        int[] a={12,45,76,79,105,165};
        System.out.println("hi");
        System.out.println(search(165, a));
    }
    public static int search(int q,int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==q){
                return mid;
            }
            else if(arr[mid]>q){
                end=mid-1;
            }
            else if(arr[mid]<q){
                start=mid+1;
            }
            else break;
        }
        return -1;
    }
}
