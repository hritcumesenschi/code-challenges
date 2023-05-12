public abstract class Animal {

   protected int legs;

    protected Animal(int legs)
    {
        this.legs = legs;
    }
    public abstract void eat();

    public void walk()
    {
        if(legs == 4)System.out.println("He runs cause he has 4 legs");
        else if(legs == 2)System.out.println("He flies cause he has 2 legs");
        else if(legs == 1)System.out.println("He sits cause he has one leg");
        else if(legs == 8)System.out.println("He crawls cause he has 8 legs");
    }



}
