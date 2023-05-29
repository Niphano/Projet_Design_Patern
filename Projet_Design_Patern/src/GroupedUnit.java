import java.util.ArrayList;
import java.util.List;

class GroupedUnit extends Unit {
    private List<SimpleUnit> units;

    public GroupedUnit(UnitType type, int foodCost) {
        super(type, foodCost);
        this.units = new ArrayList<>();
    }

    public List<SimpleUnit> getUnits() {
        return units;
    }

    public void addUnit(SimpleUnit unit) {
        units.add(unit);
    }

    public void removeUnit(SimpleUnit unit) {
        units.remove(unit);
    }
}