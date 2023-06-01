import java.util.ArrayList;
import java.util.List;

public class Leaders {
    private List<Integer> integers;

    public Leaders() {
        integers = new ArrayList<>();
    }

    public void addInteger(int value) {
        integers.add(value);
    }

    public List<Integer> getIntegers() {
        return integers;
    }

    public void printLeaders() {
        int n = integers.size();
        int maxFromRight = integers.get(n - 1);
        System.out.println(maxFromRight);

        for (int i = n - 2; i >= 0; i--) {
            if (integers.get(i) > maxFromRight) {
                maxFromRight = integers.get(i);
                System.out.println(maxFromRight);
            }
        }
    }

    public static void main(String[] args) {
        Leaders leaders = new Leaders();

        // Adding integers to the list
        leaders.addInteger(1000);
        leaders.addInteger(20);
        leaders.addInteger(600);
        leaders.addInteger(40);
        leaders.addInteger(50);

        // Printing the leaders
        leaders.printLeaders();
    }
}
