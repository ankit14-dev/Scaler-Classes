public class GoogleQuestion {
    public static void main(String[] args) {
        
        int [][]q;


        int arr[]=new int[n];
        for(int i=0;i<q.length;i++){
            int l=q[i][0];
            int r=q[i][1];
            int v=q[i][2];
            
            arr[l]=v;
            if (r<n-1) arr[r+1]=-v;

        }
        int prefixSum[]=new int[n];
        for(int i=0;i<n;i++){
            prefixSum[i]=arr[i];
            if(i>0) prefixSum[i]+=prefixSum[i-1];
        }
    }
}
