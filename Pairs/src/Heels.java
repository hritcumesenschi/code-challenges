public class Heels {
    private String name, color;
    private int size;

    int getSize(){return size;}
    String getName(){return name;}
    String getColor(){
        return  color;
    }

    Heels(String name, int size, String color)
    {
        this.name = name;
        this.color = color;
        this.size = size;
    }
}
