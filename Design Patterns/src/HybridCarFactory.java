public class HybridCarFactory extends CarFactory {
    @Override
    public Car createCar() {
        return new HybridCar();
    }
}
