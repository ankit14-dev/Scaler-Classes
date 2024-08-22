public class Solution {
    public static void main(String args[]) {
        // Write your code here.
        int k=1;
        for(int i=0;i<=7;i++){
            int j=4;
            int counter=7;
            while (counter>0) {
                System.out.print(j);
                if (j!=1) {
                    j--;
                    
                }
                counter-=2;
                k++;
            }
            System.out.println();
        }
    }
}