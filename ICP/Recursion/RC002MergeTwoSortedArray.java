public class RC002MergeTwoSortedArray{
    public static void main(String args[]){
        int arr1[]={3,8,10,15,20};
        int arr2[]={1,2,3,9,11,18,19,21,30,40};

        int arr3[]=new int[arr1.length+arr2.length];
        int arr1Index=0;
        int arr2Index=0;
        for(int i=0;i<arr3.length;i++){
            if(arr1Index>=arr1.length){
                arr3[i]=arr2[arr2Index];
                arr2Index++;
                continue;
            }
            if(arr2Index>=arr2.length){
                arr3[i]=arr1[arr1Index];
                arr1Index++;
                continue;
            }
            arr3[i]=Math.min(arr1[arr1Index],arr2[arr2Index]);
            if(arr1[arr1Index]<arr2[arr2Index]) arr1Index++;
            else arr2Index++;
        }
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }
        System.out.println();
    }
}