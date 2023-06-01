public class Main {
    public static void main(String[] args) {

        Running runningShoe1 = new Running("RED", 41,"Red");
        Running runningShoe2 = new Running("RED", 40,"Red");
        Pairs<Running> pairOK = new Pairs<>(runningShoe1, runningShoe2);

        Boot bootshoe1 = new Boot("Black", 38,"Blue");
        Boot bootshoe2 = new Boot("Black", 38, "Red");


        Pairs<Running> pairKO = new Pairs<>(bootshoe1, bootshoe2);



    }
}