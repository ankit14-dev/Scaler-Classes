import java.util.Scanner;

public class Subarray {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        n++;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=i+1;
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<j;k++){
                    System.out.print(arr[k]+", ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
