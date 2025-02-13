public class Test {
    public static void main(String[] args) {
        int[] arr={1,2,2,4,5,5,6,7,8};
        ceil(arr,5);
    }
    public static void ceil(int[] arr,int b){
        int n=arr.length;
        int s=0;
        int e=n-1;
        int ans=0;
        /* while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]==b){
                e=mid-1;
            }else if(arr[mid]<b){
                s=mid+1;
                ans=mid;
            }else{
                e=mid-1;
            }
        } */
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]==b){
                e=mid-1;
                ans=mid;

            }
            else if(arr[mid]>b){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        System.out.println(ans+" "+arr[ans]);
    }
}
