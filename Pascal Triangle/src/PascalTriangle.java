public class PascalTriangle {
    public static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            // Add spacing for left alignment
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                // Calculate binomial coefficient using factorial function
                int coefficient = factorial(i) / (factorial(i - j) * factorial(j));
                System.out.print(" " + coefficient);
            }

            // Print a new line after each row
            System.out.println();
        }
    }
}
