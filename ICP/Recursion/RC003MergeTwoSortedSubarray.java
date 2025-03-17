public class RC003MergeTwoSortedSubarray {

    public static void main(String[] args) {
        int arr[]={8,1,3,6,11,12,4,9,7,6};
        int l,m,r;
        l=2;
        m=5;
        r=7;;
        merge(arr,l,m,r);
    }
    public static void merge(int[] arr,int l,int m,int r){
        int n1=m-l;
        int n2=r-m+1;
        int[] arr1=new int[n1];
        int[] arr2=new int[n2];
        for(int i=0;i<n1;i++){
            arr1[i]=arr[l+i];
        }
        for(int i=0;i<n2;i++){
            arr2[i]=arr[m+i];
        }
        int[] arr3=new int[n1+n2];
        int arr1Index=0;
        int arr2Index=0;
        for(int i=0;i<n1+n2;i++){
            if(arr1Index>=n1){
                arr3[i]=arr2[arr2Index];
                arr2Index++;
                continue;
            }
            if(arr2Index>=n2){
                arr3[i]=arr1[arr1Index];
                arr1Index++;
                continue;
            }
            arr3[i]=Math.min(arr1[arr1Index],arr2[arr2Index]);
            if(arr1[arr1Index]<arr2[arr2Index]) arr1Index++;
            else arr2Index++;
        }
        for(int i=l;i<=r;i++){
            arr[i]=arr3[i-l];
        }
    }
}