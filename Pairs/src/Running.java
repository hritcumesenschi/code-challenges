public class Running implements Shoe{
    private String name, color;
    private int size;

    int getSize(){return size;}
    String getName(){return name;}
    String getColor(){
        return  color;
    }

    Running(String name, int size, String color)
    {
        this.name = name;
        this.size = size;
        this.color = color;
    }

}
