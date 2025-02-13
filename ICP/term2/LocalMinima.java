public class LocalMinima {
    public static void main(String[] args) {
        int arr[]={5,6,3,1,2,4,7,9};
        System.out.println(search(arr));
    }
    public static int search(int[] arr) {
        int start=1;
        int end=arr.length-2;
        int ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]<arr[mid+1] && arr[mid]<arr[mid-1]){
                ans=mid;
                return ans;
            }
            else if(arr[mid]>arr[mid-1]){
                end=mid-1;
            }
            else if(arr[mid]>arr[mid+1]){
                start=mid+1;
            }
        }
        return ans;
    }
}
