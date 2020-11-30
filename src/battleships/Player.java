package battleships;

import java.util.LinkedList;

public class Player {

    public final String name;
    private LinkedList<Ships> shipsList;

    public Player(String name) {
        this.name = name;
        createShipsList();
    }

    private void createShipsList() {
        shipsList = new LinkedList<>();

        shipsList.add(Ships.BATTLESHIP);
        shipsList.add(Ships.CARRIER);
        shipsList.add(Ships.CARRIER);
        shipsList.add(Ships.DESTROYER);
        shipsList.add(Ships.DESTROYER);
        shipsList.add(Ships.DESTROYER);
        shipsList.add(Ships.SUBMARINE);
        shipsList.add(Ships.SUBMARINE);
        shipsList.add(Ships.SUBMARINE);
        shipsList.add(Ships.SUBMARINE);
    }

    public LinkedList<Ships> getShipsList() {
        return shipsList;
    }
}
