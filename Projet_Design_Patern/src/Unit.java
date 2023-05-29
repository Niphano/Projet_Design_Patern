class Unit {
    // Enumération des types d'unités
    public enum UnitType {
        LUMBERJACK, MINER, FARMER
    }

    private UnitType type;
    private int experience;
    private int foodCost;

    public Unit(UnitType type, int foodCost) {
        this.type = type;
        this.experience = 0;
        this.foodCost = foodCost;
    }

    public UnitType getType() {
        return type;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getFoodCost() {
        return foodCost;
    }
}