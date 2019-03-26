package Chapter1.Abhi;

public class ZeroMatrix {

    public int[][] modifyMatrixWithZero(int[][] matrix){
        int m = matrix[0].length;
        int n = matrix[1].length;
        int[][] zeroMatrix = new int[m][n];
        boolean[] row =  new boolean[m];
        boolean[] col =  new boolean[n];
        for(int i=0;i<m;i++){
            for (int j =0;j<n;j++){
                if(matrix[i][j]== 0){
                    row[i]=true;
                    col[j] =true;
                }
            }
        }
        for(int i=0;i<m;i++){
            for (int j =0;j<n;j++){
                if(row[i] || col[j]){
                    zeroMatrix[i][j] = 0;
                }else{
                    zeroMatrix[i][j] = matrix[i][j];
                }
            }
        }
        return zeroMatrix;
    }
}
