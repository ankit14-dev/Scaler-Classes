public class GoogleMatrixHard {
    public static void main(String[] args) {
        int [][]matrix={{1,2,3},{4,5,6},{7,8,9}};

        int queries[];

        int prefixSumMatrix[][]=new int[n][m];
        for(int i=0;i<n;i++){
            prefixSumMatrix[0][i]=matrix[0][i];
            if(i>0) prefixSumMatrix[0][i]=prefixSumMatrix[0][i-1];
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<m;j++){
                prefixSumMatrix[i][j]=prefixSumMatrix[i-1][j]+matrix[i][j];
            }
        }
    }
}
