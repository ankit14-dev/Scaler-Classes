public class FloorArray {
    public static void main(String[] args) {
        int arr[]={-4,-1,5,7,16,19,24,29};
        System.out.println(floor(15, arr));
        System.out.println();
        System.out.println();
    }
    public static int floor(int query,int[] arr){
        int start=0;
        int end=arr.length-1;
        int ans=arr[0];
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==query){
                return arr[mid];
            }
            else if(arr[mid]>query){
                end=mid-1;

            }
            else{
                start=mid+1;
                ans=arr[mid];
            }
        }


        return ans;
    }
    
}
