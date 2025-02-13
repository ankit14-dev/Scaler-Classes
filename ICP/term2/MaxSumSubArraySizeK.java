public class MaxSumSubArraySizeK {

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int n=arr.length;
        int prefixSum[]=new int[n];
        for(int i=0;i<n;i++){
            prefixSum[i]=arr[i];
            if(i>0) prefixSum[i]+=prefixSum[i-1];
        }
        int ans;
        for(int i=k;i<n;i++){
            int temp=prefixSum[i]-prefixSum[i-k];
            ans=Math.max(ans,temp);
        }
    }
}