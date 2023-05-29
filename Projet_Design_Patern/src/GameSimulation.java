import java.util.List;
import java.util.Random;

class GameSimulation {
    private GameMap gameMap;
    private Player player;

    public GameSimulation(int mapWidth, int mapHeight, int initialFood) {
        this.gameMap = new GameMap(mapWidth, mapHeight);
        this.player = new Player(initialFood);
    }

    public void initializeResources() {
        Random random = new Random();
        int mapWidth = gameMap.getWidth();
        int mapHeight = gameMap.getHeight();

        for (int x = 0; x < mapWidth; x++) {
            for (int y = 0; y < mapHeight; y++) {
                int resourceTypeIndex = random.nextInt(Resource.ResourceType.values().length);
                Resource.ResourceType resourceType = Resource.ResourceType.values()[resourceTypeIndex];
                int quantity = random.nextInt(10) + 1; // Random quantity between 1 and 10
                gameMap.setResource(x, y, new Resource(resourceType, quantity));
            }
        }
    }

    public void createUnit(Unit.UnitType unitType) {
        int foodCost = 10; // Example food cost
        if (player.getFood() >= foodCost) {
            SimpleUnit unit = new SimpleUnit(unitType, foodCost);
            player.addUnit(unit);
            player.setFood(player.getFood() - foodCost);
            System.out.println("Created unit: " + unitType);
        } else {
            System.out.println("Not enough food to create unit: " + unitType);
        }
    }

    public void destroyUnit(Unit unit) {
        player.removeUnit(unit);
        // Additional logic for resource recovery or other consequences
        System.out.println("Destroyed unit: " + unit.getType());
    }

    public void createBuilding(Building.BuildingType buildingType) {
        int resourceCost = 50; // Example resource cost
        if (checkResourceAvailability(resourceCost)) {
            Building building = new Building(buildingType, resourceCost);
            // Additional logic for building creation
            System.out.println("Created building: " + buildingType);
        } else {
            System.out.println("Not enough resources to create building: " + buildingType);
        }
    }

    public void destroyBuilding(Building building) {
        // Additional logic for resource recovery or other consequences
        System.out.println("Destroyed building: " + building.getType());
    }

    public void groupUnits(List<SimpleUnit> unitsToGroup) {
        int groupSize = unitsToGroup.size();
        if (groupSize > 1) {
            Unit.UnitType groupType = unitsToGroup.get(0).getType();
            int foodCost = 10 * groupSize; // Example food cost
            if (player.getFood() >= foodCost) {
                GroupedUnit groupedUnit = new GroupedUnit(groupType, foodCost);
                for (SimpleUnit unit : unitsToGroup) {
                    player.removeUnit(unit);
                    groupedUnit.addUnit(unit);
                }
                player.addUnit(groupedUnit);
                player.setFood(player.getFood() - foodCost);
                System.out.println("Created grouped unit: " + groupType);
            } else {
                System.out.println("Not enough food to create grouped unit: " + groupType);
            }
        } else {
            System.out.println("Cannot create group with less than 2 units.");
        }
    }

    public boolean checkResourceAvailability(int requiredResources) {
        // Additional logic to check if player has enough resources
        return player.getInventory().size() >= requiredResources;
    }

    public void simulateTurn() {
        // Additional logic to simulate a single turn
        System.out.println("Simulating a turn...");
    }

    public boolean isGameOver() {
        // Additional logic to check if the game is over
        return player.getUnits().isEmpty() || player.getFood() <= 0;
    }

    public GroupedUnit getPlayer() {
        return null;
    }
}
