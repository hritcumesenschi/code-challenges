

public class Main
{
    public static void main(String[] args)
    {
        Computer.Builder builder = new Computer.Builder("Intel I7");
        builder.setBluetooth(true);
        builder.setMemory(300);
        builder.setRam(2000);
        builder.setVideo("Nvidia");

        Computer myComputer = builder.build();
        System.out.println(myComputer);
    }
}