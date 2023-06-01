public class CarClient {
    public static void main(String[] args) {
        CarFactory factory;

        // Creating an electric car
        factory = new ElectricCarFactory();
        Car electricCar = factory.createCar();
        electricCar.assemble();
        electricCar.testDrive();

        // Creating a hybrid car
        factory = new HybridCarFactory();
        Car hybridCar = factory.createCar();
        hybridCar.assemble();
        hybridCar.testDrive();
    }
}
//abstract factory
