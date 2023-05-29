import java.util.ArrayList;
import java.util.List;

class Player {
    private int food;
    private List<Resource> inventory;
    private List<Unit> units;

    public Player(int initialFood) {
        this.food = initialFood;
        this.inventory = new ArrayList<>();
        this.units = new ArrayList<>();
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public List<Resource> getInventory() {
        return inventory;
    }

    public void addToInventory(Resource resource) {
        inventory.add(resource);
    }

    public void removeFromInventory(Resource resource) {
        inventory.remove(resource);
    }

    public List<Unit> getUnits() {
        return units;
    }

    public void addUnit(Unit unit) {
        units.add(unit);
    }

    public void removeUnit(Unit unit) {
        units.remove(unit);
    }
}