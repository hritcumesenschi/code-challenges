public class ElectricCarFactory extends CarFactory {
    @Override
    public Car createCar() {
        return new ElectricCar();
    }
}