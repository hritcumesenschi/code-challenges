public class Main
{
    public static void main(String[] args)
    {
        Apartment app01 = new Apartment("Manastur", 700);
        Apartment app02 = new Apartment("Manastur", 500);
        Apartment app03 = new Apartment("Manastur", 250);
        Apartment app04 = new Apartment("Manastur", 550);
        Apartment app05 = new Apartment("Manastur", 150);

        RealEstateAgentProxy proxy = new RealEstateAgentProxy();
        proxy.represent(app01);
        proxy.represent(app02);
        proxy.represent(app03);
        proxy.represent(app04);
        proxy.represent(app05);

        Student student01 = new Student("Ionescu", 500);
        Student student02 = new Student("Popescu", 330);

        Apartment apartmentForStudent01 = proxy.rent(student01);
        System.out.println(student01 + " a inchiriat " + apartmentForStudent01);
        Apartment apartmentForStudent02 = proxy.rent(student02);
        System.out.println(student02 + " a inchiriat " + apartmentForStudent02);
    }
}
