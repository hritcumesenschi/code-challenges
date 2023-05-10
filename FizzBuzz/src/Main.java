// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

        //stage 1 requirements
        for (int i = 1; i <= 100; i++) {
            if(i == 15) System.out.println("FizzBuzz ");
            else if (i % 3 == 0) System.out.println("Fizz ");
            else if(i % 5 == 0)System.out.println("Buzz ");
            //stage 2 requirements
            //else if (i % 7 == 0)System.out.println("Rizz ");
            //else if (i % 11 == 0)System.out.println("Jazz ");
            else System.out.println(i + " ");
        }

    }
}