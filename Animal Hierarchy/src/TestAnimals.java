public class TestAnimals {

    void mainMethod()
    {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        System.out.println("checking for object d...");
        System.out.println(d.legs);
        d.eat();
        //d.walk();

        System.out.println("checking for object c...");
        System.out.println(c.legs);
        System.out.println(c.name);
        c.eat();
        c.walk();
        System.out.println(c.getName());
        c.play();
        c.setName("Petunia");
        System.out.println(c.getName());

        System.out.println("checking for object a...");
        System.out.println(a.legs);
        a.eat();

        System.out.println("checking for object e...");
        System.out.println(e.legs);
        e.eat();
        e.walk();

        System.out.println("checking for object p...");
        System.out.println(p.getName());
        p.play();
        p.setName("Petunia");
        System.out.println(p.getName());
    }
}
