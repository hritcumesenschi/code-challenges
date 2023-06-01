public class BellTriangle {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        int[][] bellTriangle = new int[n][n];
        bellTriangle[0][0] = 1;

        //Bell
        for (int i = 1; i < n; i++) {
            bellTriangle[i][0] = bellTriangle[i - 1][i - 1];

            for (int j = 1; j <= i; j++) {
                bellTriangle[i][j] = bellTriangle[i - 1][j - 1] + bellTriangle[i][j - 1];
            }
        }

       //Printinh
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(bellTriangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
