class HouseBuilder implements BuildingBuilder {
    private Building building;

    public HouseBuilder() {
        this.building = new Building();
    }

    public void buildFoundation() {
        building.setFoundation("Concrete Slab");
    }

    public void buildStructure() {
        building.setStructure("Brick and Wood");
    }

    public void buildInterior() {
        building.setInterior("Cozy Furnishings");
    }

    public void buildRoof() {
        building.setRoof("Shingle Tiles");
    }

    public Building getBuilding() {
        return this.building;
    }
}
