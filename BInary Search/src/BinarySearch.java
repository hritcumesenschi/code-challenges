import java.io.*;

class BinarySearch {

    //this algorithm works for both ascending and descending sorted array
    boolean isAscendingSorted(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    boolean isDescendingSorted(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // Returns index of x if it is present in arr[].
    int binarySearch(int arr[], int x) throws Exception {
        if (isAscendingSorted(arr)) {
            int l = 0, r = arr.length - 1;
            while (l <= r) {
                int m = l + (r - l) / 2;

                // Check if x is present at mid
                if (arr[m] == x)
                    return m;

                // If x greater, ignore right half
                if (arr[m] < x)
                    l = m + 1;

                    // If x is smaller, ignore left half
                else
                    r = m - 1;
            }
        } else if (isDescendingSorted(arr)) {
            int l = 0, r = arr.length - 1;
            while (l <= r) {
                int m = l + (r - l) / 2;

                // Check if x is present at mid
                if (arr[m] == x)
                    return m;

                // If x greater, ignore left half
                if (arr[m] > x)
                    l = m + 1;

                    // If x is smaller, ignore right half
                else
                    r = m - 1;
            }
        } else {
            throw new Exception("ArrayNotSortedException");
        }

        // If we reach here, then element was not present
        return -1;
    }

    // Driver code
    public static void main(String args[]) {
        BinarySearch ob = new BinarySearch();
        int arr[] = { 1,2,3,4};
        int n = arr.length;
        int x = 2;
        try {
            int result = ob.binarySearch(arr, x);
            if (result == -1)
                System.out.println("Element is not present in array");
            else
                System.out.println("Element is present at index " + result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
