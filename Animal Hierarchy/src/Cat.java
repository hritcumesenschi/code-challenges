public class Cat extends Animal implements Pet{

    public String name;
    public void setName(String name)
    {
        this.name = name;
    }
    public Cat (String name)
    {
        super(4);
        setName(name);
    }
    public Cat ()
    {
        this("");
    }

    public String getName()
    {
        return name;
    }


    public void eat()
    {
        System.out.println("He eats fish");
    }
    public void play()
    {
        System.out.println("He plays with mice");
    }
}




