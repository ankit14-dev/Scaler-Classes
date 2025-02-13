package Sets;

public class HM010SubarrayWithSumK {
    public static void main(String[] args) {
        int a[]={-5,7,4,5,-2,1,-3,-2,1,8};
        int[] psum=prefixSum(a);
        int k=7;
        for(int i=0;)
    }
    public static int[] prefixSum(int[] arr){
        int n=arr.length;
        int []prefixSum =new int[n];
        for(int i=0;i<n;i++){
            prefixSum[i]=arr[i];
            if(i>0) prefixSum[i]+=prefixSum[i-1];
        }
        return prefixSum;
    }
    public static void Print(int[] a){
        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
