public class Rough {
    public static void main(String[] args) {
        int[] arr={4,8,-1,9,5};
        int n=5;
        int maxSum=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum<0 ) sum=0;
            if(sum>maxSum) maxSum=sum;
        }
        System.out.println(maxSum);
    }
}
