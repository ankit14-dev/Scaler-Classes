public class MaxSumKadanis {
    public static void main(String[] args) {
        
    }
    public static int maxSubarrarySum(int[] arr){
        int n=arr.length;
        int ans=arr[0];
        
        for(int i=1;i<n;i++){
            sum+=arr[i];
        }


        return ans;
    } 
}
