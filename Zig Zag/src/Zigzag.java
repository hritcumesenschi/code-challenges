import java.util.Arrays;

public class Zigzag {
    public static void zigZag(int[] arr) {
        int n = arr.length;
        boolean flag = true;

        for (int i = 0; i < n - 1; i++) {
            if (flag) {
                // If current element is greater than the next element, swap them
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            } else {
                // If current element is smaller than the next element, swap them
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            flag = !flag; // Toggle the flag for next iteration
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 7, 8, 6, 2, 1 };
        zigZag(arr);
        System.out.println(Arrays.toString(arr));

    }
}
