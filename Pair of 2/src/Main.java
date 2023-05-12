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
            if (arr[i] >= 0)
                pos[arr[i]]++; //counting the positive numbers
            else if(arr[i] < 0 )
                neg[-arr[i]]++; //counting the negative numbers
        }

        if(pos[0] != 0) count+= pos[i]/2; //special case for number 0
        for (i = 1; i < 100; i++) {
            if (pos[i] != 0 && neg[i] != 0) {
                count = count + Math.min( pos[i] , neg[i] );
            }
        }
        System.out.println("Number of pairs: ");
        System.out.println(count);



    }
}