public class Main
{
    public static RockPapperScissors findWinner(RockPapperScissors p1, RockPapperScissors p2)
    {
        RockPapperScissors winner = null;

        if(p1.getOption().equals("rock"))
        {
            if(p2.getOption().equals("paper"))
                winner = p2;
            else if(p2.getOption().equals("scrissors"))
                winner = p1;
        }

        if(p1.getOption().equals("paper"))
        {
            if(p2.getOption().equals("rock"))
                winner = p1;
            else if(p2.getOption().equals("scrissors"))
                winner = p2;
        }

        if(p1.getOption().equals("scrissors"))
        {
            if(p2.getOption().equals("paper"))
                winner = p1;
            else if(p2.getOption().equals("rock"))
                winner = p2;
        }

        return winner;
    }

    public static void main(String[] args) throws InterruptedException
    {
        RockPapperScissors p1 = new RockPapperScissors("RockPapperScissors 1");
        RockPapperScissors p2 = new RockPapperScissors("RockPapperScissors 2");

        p1.start();
        p2.start();

        p1.join();
        p2.join();

        RockPapperScissors winner = findWinner(p1, p2);

        if(winner != null)
            System.out.println(winner);
        else
            System.out.println("draw");
    }
}