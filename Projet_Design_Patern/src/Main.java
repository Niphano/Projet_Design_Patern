import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Création et initialisation de la simulation de jeu
        GameSimulation gameSimulation = new GameSimulation(10, 10, 100);
        gameSimulation.initializeResources();

        // Exemple d'utilisation des actions du joueur
        gameSimulation.createUnit(Unit.UnitType.LUMBERJACK);
        gameSimulation.createBuilding(Building.BuildingType.LUMBERJACK_PRODUCTION);
        gameSimulation.simulateTurn();
        gameSimulation.createUnit(Unit.UnitType.MINER);
        gameSimulation.createUnit(Unit.UnitType.FARMER);
        gameSimulation.groupUnits(gameSimulation.getPlayer().getUnits().subList(1, 3));
        gameSimulation.simulateTurn();

        // Vérification de la fin du jeu
        if (gameSimulation.isGameOver()) {
            System.out.println("Game over!");
        }
    }
}