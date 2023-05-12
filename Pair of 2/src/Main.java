import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int[] pos = new int[100];
        int[] neg = new int[100];
        int length, i;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Length of array: ");
        length = sc.nextInt();

        System.out.println("Elements: ");
        for (i = 0; i < length; i++)
            arr[i] = sc.nextInt();

        for (i = 0; i < length; i++) {
            if (arr[i] > 0)
                pos[arr[i]]++;
            else if(arr[i] < 0 )
                neg[-arr[i]]++;
            else
            {
                pos[arr[i]]++;
                neg[arr[i]]++;
            }
        }
        for (i = 0; i < length; i++) {
            if (pos[i] != 0) {
                if ( pos[i] == neg[i] ) count+=Math.min( pos[i] , neg[i] );
            }
        }
        System.out.println("Number of pairs: ");
        System.out.println(count);



    }
}