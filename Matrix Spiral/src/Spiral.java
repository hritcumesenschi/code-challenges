public class Spiral {
    public static void generateSpiralMatrix(int m, int n) {
        int[][] matrix = new int[m][n];

        int value = 1;
        int topRow = 0, bottomRow = m - 1;
        int leftCol = 0, rightCol = n - 1;

        while (topRow <= bottomRow && leftCol <= rightCol) {
            // Traverse top row
            for (int i = leftCol; i <= rightCol; i++) {
                matrix[topRow][i] = value++;
            }
            topRow++;

            // Traverse right column
            for (int i = topRow; i <= bottomRow; i++) {
                matrix[i][rightCol] = value++;
            }
            rightCol--;

            // Traverse bottom row
            if (topRow <= bottomRow) {
                for (int i = rightCol; i >= leftCol; i--) {
                    matrix[bottomRow][i] = value++;
                }
                bottomRow--;
            }

            // Traverse left column
            if (leftCol <= rightCol) {
                for (int i = bottomRow; i >= topRow; i--) {
                    matrix[i][leftCol] = value++;
                }
                leftCol++;
            }
        }

        // Print the spiral matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int m = 5; // Number of rows
        int n = 5; // Number of columns

        generateSpiralMatrix(m, n);
    }
}
