public class HybridCar extends Car {
    @Override
    public void assemble() {
        System.out.println("Assembling hybrid car...");
    }

    @Override
    public void testDrive() {
        System.out.println("Taking hybrid car for a test drive...");
    }
}
