public class FrequencyofTarget {
    public static void main(String[] args) {
        int[] arr={-5,-5,-3,0,0,1,1,1,5,5,5,5,9};
        int target=5;
        System.out.println(ceil(target, arr)-floor(target,arr)+1);

    }
    public static int floor(int query,int[] arr){
        int start=0;
        int end=arr.length-1;
        int ans=start;

        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==query){
                end=mid-1;
                ans=mid;

            }
            else if(arr[mid]>query){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
    public static int ceil(int query,int[] arr){
        int start=0;
        int end=arr.length-1;
        int ans=start;

        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==query){
                end=mid-1;
                ans=mid;

            }
            else if(arr[mid]>query){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
}
