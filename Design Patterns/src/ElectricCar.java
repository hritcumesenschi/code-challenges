public class ElectricCar extends Car {
    @Override
    public void assemble() {
        System.out.println("Assembling electric car...");
    }

    @Override
    public void testDrive() {
        System.out.println("Taking electric car for a test drive...");
    }
}