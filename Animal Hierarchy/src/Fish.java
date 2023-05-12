public class Fish extends Animal {

    Fish()
    {
        super(0);
    }

    @Override public void walk()
    {
        throw new UnsupportedOperationException("Fish don't walk");
    }
    public void eat()
    {
        System.out.println("He eats smaller fish");
    }
}
