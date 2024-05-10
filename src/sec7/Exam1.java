package sec7;

public class Exam1 {

    public static void main(String[] args) {
        int [][] array = new int[][] {
            {3, 0, 0, 0, 0},
            {0, 2, 2, 0, 0},
            {0, 0, 0, 1, 3},
            {0, 0, 0, 2, 0},
            {3, 0, 0, 0, 1},
        };
        transformSparseMatrix(array);
        System.out.println(array);
    }

    private static int[][] transformSparseMatrix(int[][] matrix) {
        int i, j;
        int [][] sparseMatrix;
        sparseMatrix = new int[3][999];

        for(i = 1; i <= matrix.length; i++) {
            for(j = 1; j <= matrix[0].length; j++) {
                // if(matrix[i][j] != 0) {
                //     sparseMatrix[1] = i;
                //     sparseMatrix[2] = j;
                //     sparseMatrix[3] = matrix[i][j];
            }
        }

        return sparseMatrix;
        
    }
}
