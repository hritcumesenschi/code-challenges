public class BuildingConstruction {
    public static void main(String[] args) {
        BuildingBuilder skyscraperBuilder = new SkyscraperBuilder();
        CivilEngineer engineer = new CivilEngineer(skyscraperBuilder);

        engineer.constructBuilding();

        Building building = engineer.getBuilding();

        //materials used
        System.out.println("Building constructed: " + building);
    }
}
//builder
