class Building {
    // Enumération des types de bâtiments
    public enum BuildingType {
        LUMBERJACK_PRODUCTION, MINER_PRODUCTION, FARMER_PRODUCTION,
        LUMBERJACK_TOOL_CREATION, MINER_TOOL_CREATION, FARMER_TOOL_CREATION
    }

    private BuildingType type;
    private int resourceCost;

    public Building(BuildingType type, int resourceCost) {
        this.type = type;
        this.resourceCost = resourceCost;
    }

    public BuildingType getType() {
        return type;
    }

    public int getResourceCost() {
        return resourceCost;
    }
}