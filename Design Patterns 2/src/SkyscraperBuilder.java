class SkyscraperBuilder implements BuildingBuilder {
    private Building building;

    public SkyscraperBuilder() {
        this.building = new Building();
    }

    public void buildFoundation() {
        building.setFoundation("Concrete Piles");
    }

    public void buildStructure() {
        building.setStructure("Steel and Glass");
    }

    public void buildInterior() {
        building.setInterior("Luxury Amenities");
    }

    public void buildRoof() {
        building.setRoof("Glass Facade");
    }

    public Building getBuilding() {
        return this.building;
    }
}
