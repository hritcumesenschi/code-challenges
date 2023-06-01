public class CivilEngineer {
    private BuildingBuilder buildingBuilder;

    public CivilEngineer(BuildingBuilder buildingBuilder) {
        this.buildingBuilder = buildingBuilder;
    }

    public Building getBuilding() {
        return this.buildingBuilder.getBuilding();
    }

    public void constructBuilding() {
        this.buildingBuilder.buildFoundation();
        this.buildingBuilder.buildStructure();
        this.buildingBuilder.buildRoof();
        this.buildingBuilder.buildInterior();
    }
}
